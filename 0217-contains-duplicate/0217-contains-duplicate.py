class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        visit = set()

        for n in nums:
            if n not in visit:
                visit.add(n)
            else:
                return True
        return False