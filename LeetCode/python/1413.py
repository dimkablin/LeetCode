class Solution:
    def minStartValue(self, nums: List[int]) -> int:
        for i in range(1, len(nums)):
            nums[i] += nums[i-1]
        
        return max(1, 1 - min(nums))
