class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        Map = {}
        res = []
        
        for i, n in enumerate(nums):
            if n in Map:
                res.append(Map[n])
                res.append(i)
            Map[target-n] = i
        return res
        