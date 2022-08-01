class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<tokens.length; i++){
            
            if(!Character.isDigit(tokens[i].charAt(0))&&tokens[i].length()==1){
                int op2 = stack.pop();
                int op1 = stack.pop();
                stack.push(compute(op1,op2,tokens[i]));
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
    
    public int compute(int op1, int op2, String s){
        if(s.equals("*")){
            return op1*op2;
        }else if(s.equals("+")){
            return op1+op2;
        }else if(s.equals("-")){
            return op1-op2;
        }else{
            return op1/op2;
        }
    }
}