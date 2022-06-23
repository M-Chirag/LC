class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] resArr = new int[2];
        resArr[0] = findIndex(nums, target, true);
        resArr[1] = findIndex(nums, target, false);
        
        return resArr; 
    }
    
    public int findIndex(int[] nums, int target, boolean leftMost){
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
                index = m;
                if(leftMost) r = m-1;
                else l=m+1 ;
            }
        }
        return index;
    }
}