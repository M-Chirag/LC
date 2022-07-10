class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        stack.push(s.charAt(0));
        for(int i = 1; i<s.length(); i++){
            if(stack.empty())
                stack.push(s.charAt(i));
            else if(closed(stack.peek())!=s.charAt(i)){
                stack.push(s.charAt(i));
            }else{
                stack.pop();
            }
        }
        if(stack.empty()) return true;
        else return false;
    }
    public char closed(char c){
        if(c=='(') return ')';
        if(c =='[') return ']';
        if(c == '{') return '}';
        return ' ';
    }
}