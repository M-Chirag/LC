class Solution:
    # find element lesser than me to the right
    def lesser_to_right(self, arr: List[int]) -> int:
        n = len(arr)
        stack = []
        lesser = [0]*n
        
        for i, val in reversed(list(enumerate(arr))):    
            while(stack and stack[-1][0]>=val):
                stack.pop()
            if not stack:
                lesser[i] = n
            else:
                lesser[i] = stack[-1][1]
            stack.append((val,i))
        return lesser
    
    # find element lesser than me to the left
    def lesser_to_left(self, arr: List[int]) -> int:
        n = len(arr)
        stack = []
        lesser = [0]*n
        
        for i, val in enumerate(arr):    
            while(stack and stack[-1][0]>=val):
                stack.pop()
            if not stack:
                lesser[i] = -1
            else:
                lesser[i] = stack[-1][1]
            stack.append((val,i))
        return lesser
                    
    
    def largestRectangleArea(self, heights: List[int]) -> int:
        
        l_to_right = self.lesser_to_right(heights)
        # print(l_to_right)
        l_to_left = self.lesser_to_left(heights)
        # print(l_to_left)
        limiting_arr = [(r-l-1) for r,l in zip(l_to_right, l_to_left)]
        max_area = 0
        for i,h in enumerate(heights):
            max_area = max(max_area, h * limiting_arr[i])
        return max_area
        
        