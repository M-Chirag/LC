class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        Queue<Integer> countSet = new PriorityQueue<>((a,b)->b-a);
        int count = 1;
        for(int i=0;i< nums.length-1; i++){
            System.out.println(nums[i]);
            if(nums[i+1]==nums[i])
                continue;
            if(nums[i+1]-nums[i]==1){
                System.out.println("|"+count);
                count++;
            }
            else{ 
                System.out.println(count+".......");
                countSet.add(count);
                count =1;
                continue;
            }
        }
        countSet.add(count);
        System.out.println(countSet);
        return countSet.peek();
    }
}