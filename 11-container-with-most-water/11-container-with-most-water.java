class Solution {
    public int maxArea(int[] height) {
        
        int maxVol = 0;
        
        int l = 0;
        int r = height.length-1;
        
        while(l<r){
            maxVol = Math.max(maxVol,(r-l)*Math.min(height[l],height[r]));
            
            if(height[l]>height[r])
                r--;
            else
                l++;
        }
        return maxVol;
    }
}