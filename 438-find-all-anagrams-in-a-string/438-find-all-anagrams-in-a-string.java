class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> hm = new HashMap<>();
        
        for(char c: p.toCharArray()){
            hm.merge(c, 1, Integer::sum);
        }
        
        int i=0, j=0, count = hm.size(), len=p.length();
        
        List<Integer> res = new ArrayList<>();
        System.out.println(hm);
        while(j<s.length()){
            int k = j-i+1;
            
            if(hm.containsKey(s.charAt(j))){
                hm.put(s.charAt(j),hm.get(s.charAt(j))-1);
                if(hm.get(s.charAt(j))==0){
                    count--;
                }
            }
            
            if(k<len){
                j++;
            }
            
            if(k==len){
                System.out.println(count+".....");
                if(count==0){
                    res.add(i);   
                }
                if(hm.containsKey(s.charAt(i))){
                    hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
                    if(hm.get(s.charAt(i))==1)
                      count++;
                }
                i++;
                j++;
            }   
        }
        
        return res;
    }
}