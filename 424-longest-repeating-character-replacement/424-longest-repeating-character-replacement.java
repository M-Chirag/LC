class Solution {
    public int characterReplacement(String s, int k) {
        
        int i=0, j=0, res = 0;
        Map<Character, Integer> hm = new HashMap<>();
        while(j<s.length()){
            hm.merge(s.charAt(j),1,Integer::sum);
            int replaceable = (j-i+1) - Collections.max(hm.values());
            // System.out.println(replaceable+" "+hm);
            while(i<s.length()&&replaceable>k){
                hm.put(s.charAt(i), hm.get(s.charAt(i))-1);
                // System.out.println("......"+hm);
                i++;
                replaceable = (j-i+1) - Collections.max(hm.values());
            }
            res = Math.max(res, j-i+1);
            j++;
        }
        return res;
    }
}