from collections import Counter
class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        hm = Counter(nums)
        hm_sort = sorted(hm.items(), key = lambda x: x[1], reverse=True)[:k]
        # print(hm_sort)
        res = [i for i, v in hm_sort]
        # print(res)

        return res
