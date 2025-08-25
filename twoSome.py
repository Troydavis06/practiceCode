class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        there = {}

        for i in range(len(nums)):
            complement = target - nums[i]
            if complement in there:
                return([there[complement], i])
            
            there[nums[i]] = i

        