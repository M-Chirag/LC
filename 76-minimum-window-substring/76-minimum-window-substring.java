class Solution {
    public String minWindow(String s, String t) {
        
        Map<Character, Integer> tCount = new HashMap<>();
        
        if(t.length()>s.length()) return "";
        
        for(char c : t.toCharArray()){
            tCount.merge(c, 1, Integer::sum);
        }
        
        int l=0, r=0, maxLeft =0, minLength=s.length()+1, counter = tCount.size();
        
        while(r<s.length()){
            
            char rchar = s.charAt(r);
            if(tCount.containsKey(rchar)){
                tCount.put(rchar,tCount.get(rchar)-1);
                if(tCount.get(rchar)==0){
                    counter--;
                }   
            }
            
            if(counter==0){
                while(counter==0 && l<=r){
                    char lchar = s.charAt(l);
                    if(tCount.containsKey(lchar)){
                        tCount.put(lchar,tCount.get(lchar)+1);
                        if(tCount.get(lchar)==1){
                            counter++;
                        }
                    }
                    if(r-l+1 < minLength){
                        maxLeft = l;
                        minLength = r-l+1;
                    }
                    l++;
                }
            }
            r++;
        }
        System.out.println(maxLeft+"..."+minLength);
        if(minLength>s.length()) return "";
        return s.substring(maxLeft,maxLeft+minLength);
    }
}