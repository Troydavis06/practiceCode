class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();

        if(s.length()!=t.length()) return false;

        for(int i = 0 ; i < s.length() ; i ++){
            char a = s.charAt(i); char b = t.charAt(i);

            hashMap1.putIfAbsent(a, 0);
            hashMap2.putIfAbsent(b, 0);

            hashMap1.put(a, hashMap1.get(a)+1);
            hashMap2.put(b, hashMap2.get(b)+1);
        }

        if(hashMap1.size()!=hashMap2.size()) return false;

        for(char x : hashMap1.keySet()){
            if(hashMap2.get(x)==null || !hashMap1.get(x).equals(hashMap2.get(x)))
                return false;
        }
        
        return true;
    }
}
