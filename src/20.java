class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack();
        for(char ch:s.toCharArray()){
            if(stack.empty()){
                stack.push(ch);
            }else if(stack.peek()!=(char)(ch-1)&&stack.peek()!=(char)(ch-2)){
                stack.push(ch);
            }else{
                stack.pop();
            }
        }
        return stack.empty();
    }
}