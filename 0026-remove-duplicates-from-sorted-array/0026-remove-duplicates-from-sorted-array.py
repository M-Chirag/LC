class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        ptr1= 0
        ptr2= 1
        
        while ptr2<len(nums):
            
            if(nums[ptr1]!=nums[ptr2]):
                ptr1+=1
                nums[ptr1], nums[ptr2] = nums[ptr2], nums[ptr1]
            # print(nums)
            ptr2+=1
        
        return ptr1+1
            
        