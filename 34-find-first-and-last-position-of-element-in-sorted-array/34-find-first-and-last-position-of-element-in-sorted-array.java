class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] resArr = new int[2];
        resArr[0] = findFirst(nums, target);
        resArr[1] = findLast(nums, target);
        
        return resArr; 
    }
    
    public int findFirst(int[] nums, int target){
        int l = 0;
        int r = nums.length-1;
        int index = -1;
        while(l<=r){
            int m = l +(r-l)/2;
            
            if(nums[m] < target){
                l = m+1;
            }
            else if(nums[m]>target){
                r = m-1;
            }
            else{
                r = m-1;
                index = m;
            }
        }
        return index;
    }
    
    public int findLast(int[] nums, int target){
        int l = 0;
        int r = nums.length-1;
        int index = -1;
        while(l<=r){
            int m = l +(r-l)/2;
            
            if(nums[m] < target){
                l = m+1;
            }
            else if(nums[m]>target){
                r = m-1;
            }
            else{
                l = m+1;
                index = m;
            }
        }
        return index;
    }
}