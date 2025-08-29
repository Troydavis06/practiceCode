class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new ArrayList<>();
        HashMap<String, List<String>> store = new HashMap<>();

        for(int i = 0 ; i < strs.length; i ++){
            char[] cur = strs[i].toCharArray();
            Arrays.sort(cur);
            String sorted = new String(cur);

            store.putIfAbsent(sorted, new ArrayList<String>());
            store.get(sorted).add(strs[i]);
        }

        for(String x : store.keySet()){
            ret.add(store.get(x));
        }

        return ret;
    }

}
