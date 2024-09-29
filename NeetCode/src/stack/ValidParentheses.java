package stack;

import java.util.Stack;

/**
 * @Author Md. Aslam Hossain
 * @Date Sep 29, 2024
 */
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "(){}[]";
        System.out.println("Is valid parentheses: " + isValidParentheses(s));
    }

    private static boolean isValidParentheses(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')) {
                return false;
            } else {
                if (s.charAt(i) == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (s.charAt(i) == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (s.charAt(i) == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack.add(s.charAt(i));
                }
            }
        }
        return stack.isEmpty();
    }
}
