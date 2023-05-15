class Solution:
    def isHappy(self, n: int) -> bool:
        def square(n):
            res = 0
            while n:
                n, rem = divmod(n,10)
                # rem = n%10
                # n=n//10
                res+= rem**2
            return res
        
        seen = set()

        while True:
            
            n = square(n)
            if n not in seen:
                seen.add(n)
            else:
                break
        if n==1:
            return True
        else: 
            return False
        

        
