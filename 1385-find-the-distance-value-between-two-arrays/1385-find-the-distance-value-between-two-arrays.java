class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        
        // |arr1[i]-arr2[j]| <= d
        // arr1[i]-arr2[j] <=d OR arr1[i]-arr2[j]>=-d
        // arr1[i]-d <= arr2[j] OR arr1[i] + d >= arr2[j]
        
        int dist = arr1.length;
        Arrays.sort(arr2);
        for(int val : arr1){
            int l = 0;
            int r = arr2.length-1;
            while(l<=r){
                int m = l +(r-l)/2;
                if((val-d)<=arr2[m] && (val+d)>=arr2[m]){
                    dist--;
                    break;
                }else if(arr2[m]<(val-d)){
                    l = m+1;
                }else {
                    r = m-1;
                }
            }
        }
     // brute force - O(n^2)
     //    first:
     //    for(int i = 0; i< arr1.length ; i ++){
     //    second:
     //     for(int j = 0; j< arr2.length ; j++) {
     //         if(Math.abs(arr1[i]-arr2[j])<=d){
     //             System.out.println(arr1[i]+"......"+arr2[j]);
     //             dist--;
     //             break;
     //         }
     //     }
     // } 
        
        return dist;
    }
}