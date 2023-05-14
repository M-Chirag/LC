from collections import Counter
class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        s_cnt = Counter(s)
        t_cnt = Counter(t)

        return s_cnt==t_cnt
