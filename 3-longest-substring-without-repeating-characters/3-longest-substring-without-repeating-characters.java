class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        if(s.length()==0) return 0;
        Set<Character> set = new HashSet<>();
        int max = 1;
        
        while(j<s.length()){
            
            // hm.merge(s.charAt(i),1, Integer::sum);
            boolean isAdded = set.add(s.charAt(j));
            
            if(isAdded){
                j++;
            }
            if(!isAdded){
                System.out.println(set+".....");
                while(set.contains(s.charAt(j))){
                    set.remove(s.charAt(i));
                    i++;
                }
                set.add(s.charAt(j));
                j++;
            }
            max = Math.max(max, set.size());
        }
        return max;
    }
}