class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        
        stack = []
        for c in tokens:
            
            if(self.is_number(c)):
                stack.append(int(c))
            else:
                num2 = stack.pop()
                num1 = stack.pop()
                stack.append(self.operation(c, num1, num2))
        return stack[-1]
    
    def operation(self,operator :str, num1 :int, num2 :int):
        if(operator == "+"):
            return num1+num2
        if(operator == "*"):
            return num1*num2
        if(operator == "-"):
            return num1-num2
        if(operator == "/"):
            return int(num1/num2)
    
    def is_number(self,n :str):
        try:
            int(n)   # Type-casting the string to `float`.
                   # If string is not a valid `float`, 
                   # it'll raise `ValueError` exception
        except ValueError:
            return False
        return True
        