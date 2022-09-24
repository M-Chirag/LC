class Solution:
    
    def totalTimeToEat(self, piles:List[int], x: int)->int:
        total = 0
        for i in piles:
            total += math.ceil(i / x)
        return total
    
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        l,r=1,max(piles)
        res = r
        while(l<=r):
            m = r-(r-l)//2
            
            if(self.totalTimeToEat(piles,m)<=h):
                r = m-1
                res= min(res,m)
            else:
                l=m+1
        return res    
        
        