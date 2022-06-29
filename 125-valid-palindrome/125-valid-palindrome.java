class Solution {
    public boolean isPalindrome(String s) {
        List<Character> sList = new ArrayList<>();
        for(char c: s.toCharArray()){
            if(Character.isLetter(c)||Character.isDigit(c))
                sList.add(Character.toLowerCase(c));
        }
        
        System.out.println(sList);
        int l = 0;
        int r = sList.size()-1;
        for(int i=0; l<=r ; i++){
            if(sList.get(l)==sList.get(r)){
                l++;
                r--;
            }else{
                return false;
            }
        }
        return true;
    }
}