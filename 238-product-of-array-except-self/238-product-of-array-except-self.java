class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        int prefixProd = 1;
        result[0]=1;
        for(int i=1; i<nums.length; i++){
            prefixProd *= nums[i-1];
            result[i] = prefixProd;
            System.out.println(result[i]+"....");
        }
        int postfixProd = 1;
        for(int j = nums.length-2; j>=0 ; j--){
            postfixProd *= nums[j+1];
            result[j] = postfixProd*result[j];
            System.out.println("....."+result[j]);
        }
        return result;
    }
}