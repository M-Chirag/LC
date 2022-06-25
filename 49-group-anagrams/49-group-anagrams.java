class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<Integer>> hm = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        
        for(int i =0; i< strs.length; i++){
            
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String string = new String(arr);
            if(hm.containsKey(string))
                hm.get(string).add(i);
            else
                hm.put(string,new ArrayList<Integer>(List.of(i)));
        }
        
        for(String str: hm.keySet()){
            List<String> list = new ArrayList<>();
            for(int i: hm.get(str)){
                list.add(strs[i]);
            }
            result.add(list);
        }
        return result;
    }
}