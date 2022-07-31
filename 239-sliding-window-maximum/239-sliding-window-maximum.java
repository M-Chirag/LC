class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        dq.add(nums[0]);
        if(k==1) return nums;
        int i=0, j=0;
        List<Integer> res = new ArrayList<>();
        while(j<nums.length){
            int size = j-i+1;
            if(dq.peekLast()!=null && nums[j]<dq.getLast()){
                dq.addLast(nums[j]);
            }else if(j!=0){
                while(dq.peekLast()!=null && nums[j]>dq.getLast()){
                    dq.removeLast();
                }
                dq.addLast(nums[j]);
            }
            
            if(size<k){
                j++;
            }
            
            if(size==k){
                res.add(dq.getFirst());
                if(nums[i]==dq.getFirst()){
                    dq.removeFirst();
                }
                i++;
                j++;
            }
            
        }
        int[] resultArr = new int[res.size()];
        for(int x=0;x<res.size();x++){
            resultArr[x] = res.get(x);
        }
        return resultArr;
    }
}