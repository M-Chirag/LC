class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int matches = 0;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        
        if(s1.length()>s2.length()) return false;
        
        for(int i=0; i<s1.length(); i++){
            arr1[s1.charAt(i)-'a']++;
            arr2[s2.charAt(i)-'a']++;
        }
        
        for(int j=0; j<26;j++){
            if(arr1[j]==arr2[j])
                matches++;
        }
        
        int l = 0, r=s1.length();
        while(r<s2.length()){
            
            if(matches==26) return true;
            
            
            int index = s2.charAt(r)-'a';
            arr2[index]++;
            if(arr2[index]==arr1[index])
                matches++;
            else if (arr2[index]==arr1[index]+1)
                matches--;
            
            index = s2.charAt(l)-'a';
            arr2[index]--;
            if(arr1[index]==arr2[index])
                matches++;
            else if(arr2[index]==arr1[index]-1)
                matches--;
            r++;
            l++;
        }
        return matches==26? true: false;
    }
}