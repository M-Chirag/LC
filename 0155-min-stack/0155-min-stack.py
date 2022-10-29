class MinStack(object):

    def __init__(self):
        self.stack = []

    def push(self, val):
        """
        :type val: int
        :rtype: None
        """
        if(self.stack and self.stack[-1][1]<val):
            self.stack.append((val,self.stack[-1][1]))
        else:
            self.stack.append((val,val))
        

    def pop(self):
        """
        :rtype: None
        """
        val, minimum = self.stack.pop()
        return val
        

    def top(self):
        """
        :rtype: int
        """
        return self.stack[-1][0]
        

    def getMin(self):
        """
        :rtype: int
        """
        return self.stack[-1][1]
        


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()