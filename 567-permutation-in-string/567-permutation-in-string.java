class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr1 = new int[26];
        for(int i=0; i<s1.length(); i++){
            arr1[s1.charAt(i)-'a']++;
        }
        int i=0, j=0;
        int[] arr2 = new int[26];
        while(j<s2.length()){
            arr2[s2.charAt(j)-'a']++;
            int size = j-i+1;
            
            if(size==s1.length() && j<s2.length()){
                System.out.println(s2.charAt(i)+" "+s2.charAt(j)+"...."+arr2[s2.charAt(j)-'a']);
                if(Arrays.equals(arr1,arr2))
                    return true;
                arr2[s2.charAt(i)-'a']--;
                i++;
            }
            
            j++;
        }
        
        for(int e: arr1)
            System.out.print(e+" ");
        System.out.println();
        for(int f: arr2)
            System.out.print(f+" ");
        return false;
    }
}