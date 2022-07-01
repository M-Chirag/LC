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
            
            while(l<r){
                int threeSum = nums[i]+nums[l]+nums[r];
                if(0<threeSum){
                    r--;
                }else if(0>threeSum){
                    l++;
                }else{
                    List<Integer> candidate = new ArrayList<>();
                    Collections.addAll(candidate,new Integer[]{nums[i],nums[l],nums[r]});
                    System.out.println(candidate);
                    res.add(candidate);
                    l++;
                    while(nums[l]==nums[l-1] && l<r)
                        l++;
                    }
            }
        }
      List<List<Integer>> result = res.stream().collect(Collectors.toList());
      return result;  
    }
}