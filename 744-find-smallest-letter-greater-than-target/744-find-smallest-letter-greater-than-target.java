class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int n = letters.length;
        
        if(letters[n-1]<target) {
            System.out.println(letters[n-1]+"..."+ target);
            return letters[0];
        }
        
        int l = 0;
        int r = n-1;
        while(l<=r){
            int m = l + (r-l)/2;
            if(letters[m]<=target){
                l = m+1;
            }
            else
                r = m-1;
        }
    return letters[l%n];
    }
}