class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();

        for(int i = 0; i < c.length; i++){ 
            if(c[i] == '(' ) stack.push(')');
            else if(c[i] == '[' ) stack.push(']');
            else if(c[i] == '{' ) stack.push('}');
            else if(!stack.isEmpty() && stack.peek() == c[i]) stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }
}