class Solution:
    
    def nextLesserRight(self, heights: List[int]) -> List[int]:
        op=[]
        stack=[]
        # if (is_right):
        #     ls = list(reversed(heights))
        # else:
        #     ls = heights
        # print(ls)
        for i,e in reversed(list(enumerate(heights))):
            while(stack and heights[stack[-1]]>=e):
                stack.pop()
            op.append(len(heights)) if(not stack) else op.append(stack[-1])
            stack.append(i)
        return op
    
    def nextLessLeft(self, heights: List[int]) -> List[int]:
        op = []
        stack = [] 
        for i,e in enumerate(heights):
            while(stack and heights[stack[-1]]>=e):
                stack.pop()
            op.append(-1) if (not stack) else op.append(stack[-1])
            stack.append(i)
        return op
    
    def largestRectangleArea(self, heights: List[int]) -> int:
        res = 0
        
        right_list = self.nextLesserRight(heights)
        right_list.reverse()
        
        left_list = self.nextLessLeft(heights)
        
        for i in range(len(right_list)):
            r_index = right_list[i]
            l_index = left_list[i]

            # if(left_list[i]==-1 and right_list[i] ==-1):
            #     area = len(right_list)*heights[i]
            #     # print(".......")
            # else:
            area = (r_index-l_index -1)*heights[i]
            # print(area)
            res = max(area, res)
        
        return res
    
    
    
    
                
        