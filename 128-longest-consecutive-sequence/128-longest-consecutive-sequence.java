class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        
        if(nums.length==0) return 0;
        
        for(int i=0; i<nums.length; i++){
            numSet.add(nums[i]);
        }
        
        Queue<Integer> countQ = new PriorityQueue<>((a,b)-> b-a);
        countQ.add(1);
        for(Integer n: numSet){
            int count=1;
            if(!numSet.contains(n-1)){
                int seqElement = n+1;
                while(numSet.contains(seqElement)){
                    count++;
                    seqElement++;
                }
                countQ.add(count);
            }
        }
        System.out.println(countQ);
        return countQ.peek();
    }
}