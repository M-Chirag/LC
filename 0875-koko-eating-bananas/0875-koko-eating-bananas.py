import math
class Solution(object):
    def minEatingSpeed(self, piles, h):
        """
        :type piles: List[int]
        :type h: int
        :rtype: int
        """
        def totalTime(speed):
            total = 0
            for p in piles:
                total+=math.ceil((p*1.0)/speed)
            return total

        l, r= 1, max(piles)
        res = r
        while l<=r:

            m = (l+r)//2
            time = totalTime(m)
    
            if time<=h:
                r=m-1
                res = min(res, m)
            elif time>h:
                l = m+1
            
        # print(m)
        return res




        