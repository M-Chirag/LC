class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProf = 0;
        int l = 0;
        int r = 1;
        while(r<n){
            maxProf = Math.max(maxProf, prices[r]-prices[l]);
            if(prices[l]>prices[r]){
                l=r;
                r++;
            }else{
                r++;
            }
            // System.out.println(maxProf+"...." + r);
        }
     return maxProf;   
    }
}