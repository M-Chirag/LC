class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        
        for(int n : nums){
            if(numSet.contains(n))
                return true;
            else
                numSet.add(n);
        }
        return false;
    }
}