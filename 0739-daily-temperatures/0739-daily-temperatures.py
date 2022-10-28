class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        res = [0]*len(temperatures)
        stack = [] 
        
        for i,v in enumerate(temperatures):
            
            
            if(len(stack)==0 or v<=stack[-1][0]):
                stack.append((v,i))
            
            
            if(len(stack)>0 and v>stack[-1][0]):
                while(len(stack)>0 and v>stack[-1][0]):
                    res[stack[-1][1]] = i-stack[-1][1]
                    stack.pop()
                stack.append((v,i))
        return res
        