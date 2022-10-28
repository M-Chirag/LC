class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        res = [0]*len(temperatures)
        stack = [] 
        
        for i,v in enumerate(temperatures):
            #keep popping and adding to result array until we find an element at stack.top() which is                   greater than v
            while(stack and v>stack[-1][0]):
                res[stack[-1][1]] = i-stack[-1][1]
                stack.pop()
            
            #push element after the above check is complete
            stack.append((v,i))
        return res
        