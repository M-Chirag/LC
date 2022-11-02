class Solution:
    def calPoints(self, operations: List[str]) -> int:
        
        stack = []
        for c in operations:
            
            if(c=='+'):
                num1 , num2 = stack[-1], stack[-2]
                stack.append(num1+num2)
                continue
            
            if(c == 'C'):
                stack.pop()
                continue
            
            if(c == 'D'):
                stack.append(stack[-1]*2)
                continue
            
            stack.append(int(c))
        
        return sum(stack)
            
            
        