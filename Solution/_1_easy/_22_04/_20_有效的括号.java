package src.com.mu;

import java.util.Stack;

public class _20_有效的括号 {
    public static void main(String[] args) {
        boolean ret = Solution.isValid("()[]{}");
    }

    class Solution {
        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<Character>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else if (stack.isEmpty() || c == ')' && stack.pop() != '(' || c == ']' && stack.pop() != '[' || c == '}' && stack.pop() != '{') {
                    return false;
                }
            }
            return false;
        }
    }
}
