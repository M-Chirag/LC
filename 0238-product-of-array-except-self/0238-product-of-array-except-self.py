class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n=len(nums)
        res = [1]*n
        cur=1
        for i in range(n):
            res[i] = cur
            cur*=nums[i]
        cur=1
        for i in range(n-1,-1,-1):
            res[i]*=cur
            cur*=nums[i]
        # print(res)

        return res