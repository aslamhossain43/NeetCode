package stack;

import java.util.Stack;

/**
 * @Author Md. Aslam Hossain
 * @Date Sep 30, 2024
 */
public class ReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println("Evaluated value of reverse polish notation is: " + evalRPN(tokens));
    }

    private static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
             switch (token) {
                case "+" -> stack.add(stack.pop() + stack.pop());
                case "-" -> {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.add(b - a);
                }
                case "*" -> stack.add(stack.pop() * stack.pop());
                case "/" -> {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.add(b / a);
                }
                default -> stack.add(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
