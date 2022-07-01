class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> res = new HashSet<List<Integer>>();
        
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++)
        {
            int l=i+1;
            int r=nums.length-1;
            
            if(i!=0 && nums[i]==nums[i-1])
                continue;
            
            int sum = 0-nums[i];
            
            while(l<r){
                
                if(nums[l]+nums[r]>sum){
                    r--;
                }else if(nums[l]+nums[r]<sum){
                    l++;
                }else{
                    List<Integer> candidate = new ArrayList<>();
                    Collections.addAll(candidate,new Integer[]{nums[i],nums[l],nums[r]});
                    System.out.println(candidate);
                    res.add(candidate);
                    l++;
                    r--;
                    }
            }
        }
      List<List<Integer>> result = res.stream().collect(Collectors.toList());
      return result;  
    }
}