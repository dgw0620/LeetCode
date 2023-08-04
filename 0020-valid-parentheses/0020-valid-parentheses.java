import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') stack.push(c);
            else if (!stack.isEmpty()) {
                char top = stack.pop();
                if (top == '(' && c != ')') return false;
                if (top == '{' && c != '}') return false;
                if (top == '[' && c != ']') return false;
                    
            } else {
                return false;
            }
        }
        
        return stack.isEmpty() ? true : false;
    }
}