class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        sums =[]
        sums.append(nums[0])
        for i in range(1,len(nums)):
            sums.insert(i,nums[i]+sums[i-1])
        
        print(sums)
        
        for i,e in enumerate(sums):
            
            if(i==0):
                leftSum = 0
            else:
                leftSum = sums[i-1]
                
            if(i==(len(nums)-1)):
                rightS = 0
            else:
                rightS = sums[len(nums)-1]- leftSum - nums[i]
            print(leftSum," ..",rightS)
            if(leftSum == rightS):
                return i
        return -1 
        