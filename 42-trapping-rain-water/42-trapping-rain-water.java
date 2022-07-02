class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        int[] lMax = new int[n];
        int left= 0;
        int right =0;
        int[] rMax = new int[n];
        int h = 0;
        int capacity = 0;
        
        for(int i=1; i< n ; i++){
            left = Math.max(left, height[i-1]);
            lMax[i] = left;
        }
        
        for(int j=n-2;j>=0;j--){
            right = Math.max(right, height[j+1]);
            rMax[j]= right;
        }
        
        for(int k=0; k<n; k++){
            int val = Math.min(lMax[k],rMax[k])-height[k];
            if(val<0) val=0;
            capacity += val;
        }
        return capacity;
    }
}