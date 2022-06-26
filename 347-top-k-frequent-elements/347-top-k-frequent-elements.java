import java.util.Map.Entry;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // hashmap to count number of occurences of each element
        
        Map<Integer, Integer> hm = new HashMap<>();
        for(int n: nums){
            hm.put(n, hm.getOrDefault(n,0)+1);
        }
        System.out.println(hm);
        //bucket sort variation. create count array of length num.length and store elements 
        // occuring as number of times of index
        List<Integer>[] bucket = new List[nums.length+1];
        
        for(int key: hm.keySet()){
             System.out.println(key+"...."+hm.get(key)+"..."+ bucket[hm.get(key)]);
            if(bucket[hm.get(key)]==null){
                bucket[hm.get(key)]= new ArrayList<Integer>();
            }
            bucket[hm.get(key)].add(key);
           
        }
        
        List<Integer> result = new ArrayList<>();
        for(int i = bucket.length-1; i>0 && k>0; i--){
            List<Integer> list = bucket[i];
            if(list!=null){
                for(int n: list){
                    result.add(n);
                    k--;
                }
            }
        }
        int[] arr = new int[result.size()];
        for(int j=0;j<result.size(); j++)
            arr[j]=result.get(j);
        return arr;
    }
}