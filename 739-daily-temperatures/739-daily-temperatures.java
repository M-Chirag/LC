class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Node> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        
        for(int i=temperatures.length-1; i>=0; i--){
            Node nd = new Node(temperatures[i],i);
            if(stack.empty()){
                stack.push(nd);
                res[i] = 0;
            }
            if(stack.peek().value>temperatures[i]){
                stack.push(nd);
                res[i]=1;
            }
            if(stack.peek().value<=temperatures[i]){
                while(!stack.empty() && stack.peek().value<=temperatures[i]){
                    stack.pop();
                }
                if(stack.empty()){
                    res[i]=0;
                    stack.push(nd);
                }else{
                    res[i] = stack.peek().index - i;
                    stack.push(nd);
                }
            } 
        }
        return res;
    }
}
class Node{
    int value;
    int index;
    Node(int value, int index){
        this.value = value;
        this.index = index; 
    }
}