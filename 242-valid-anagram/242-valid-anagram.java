class Solution {
    public boolean isAnagram(String s, String t) {
        char[] listS = s.toCharArray();
        char[] listT = t.toCharArray();
        
        Arrays.sort(listS);
        Arrays.sort(listT);
        if(Arrays.equals(listS,listT))
            return true;
        else return false;
    }
}