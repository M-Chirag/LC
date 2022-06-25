class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> hm = new HashMap<>();
        
        for(int i =0; i< strs.length; i++){
            
            int[] arr = new int[26];
            for (char c : strs[i].toCharArray()){
                arr[c-'a']++;
            }
            
            List<Integer> arrList = new ArrayList<>();
            for(int e : arr)
                arrList.add(e);
            
            if(hm.containsKey(arrList))
                hm.get(arrList).add(strs[i]);
            else
                hm.put(arrList,new ArrayList<String>(List.of(strs[i])));
        }
        List<List<String>> result = new ArrayList<>(hm.values());
        return result;
    }
}