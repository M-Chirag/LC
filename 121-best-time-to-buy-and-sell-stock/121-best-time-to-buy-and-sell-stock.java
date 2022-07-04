class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = 0;
        for(int p: prices){
            if(p<buy){
                buy = p;
            }else{
                sell = Math.max(sell, p-buy);
            }
        }
        return sell;
    }
}