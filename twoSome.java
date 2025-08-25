class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            int x = nums[i];
            int complement = target - x;
            if(seen.containsKey(complement))
                return new int[]{seen.get(complement), i};
            
            seen.put(x, i);
        }

        // should never get here
        return new int[]{-1, -1};
    }
}
