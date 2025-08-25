class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> a = new HashSet<Integer>();

        for(int i = 0 ; i < nums.length ; i++){
            if(!a.add(nums[i])) return true;
        }

        return false;
    }
}