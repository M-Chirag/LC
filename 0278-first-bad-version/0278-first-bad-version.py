# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:

class Solution:
    def firstBadVersion(self, n: int) -> int:
        l = 1
        r = n
        while(l<=r):
            m = (r+l)>>1
            if(isBadVersion(m) and not isBadVersion(m-1)):
                return m
            elif(isBadVersion(m)):
                r=m-1
            else:
                l = m+1
        return -1
        