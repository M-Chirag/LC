class Solution {
    public int maxArea(int[] height) {
        
        int maxVol = 0;
        
        int l = 0;
        int r = height.length-1;
        
        while(l<r){
        
            int area = (r-l)*Math.min(height[l],height[r]);
            maxVol = Math.max(maxVol,area);
            if(height[l]>height[r])
                r--;
            else
                l++;
        }
        return maxVol;
    }
}