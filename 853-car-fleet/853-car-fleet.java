class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        
        for(int i=0; i<position.length; i++){
            map.put(position[i],speed[i]);
        } 
        
        double last_t = 0, curr_t =0; 
        int fleet = 0;
        
        for(Map.Entry<Integer, Integer>entry : map.entrySet()){
            
            curr_t = (target-entry.getKey())*1.0/entry.getValue();
            System.out.println(curr_t+"..."+last_t);
            if(curr_t>last_t){
                last_t=curr_t;
                fleet++;
            }
        }
        return fleet;
    }
}