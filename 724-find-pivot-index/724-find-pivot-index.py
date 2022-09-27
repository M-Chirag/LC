class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        total = sum(nums)
        lSum = 0
        for i in range(len(nums)):
            rSum = total - nums[i] -lSum
            if(rSum == lSum):
                return i
            lSum += nums[i]
        return -1 
        