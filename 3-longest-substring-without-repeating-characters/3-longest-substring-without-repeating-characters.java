class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        if(s.length()==0) return 0;
        Set<Character> set = new HashSet<>();
        int max = 1;
        
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
            max = Math.max(max, j-i);
        }
        return max;
    }
}