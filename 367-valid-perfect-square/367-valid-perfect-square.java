class Solution {
    public boolean isPerfectSquare(int num) {
        long l = 0;
        long r = num/2;
        if(num ==1 ) return true;
        while(l<=r){
            long m = l + (r-l)/2;
            
            if(m*m == num)
                return true;
            else if (m*m> num)
                r = m-1;
            else 
                l = m+1;
        }
        return false;
    }
}