package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author Md. Aslam Hossain
 * @Date Sep 30, 2024
 */
public class ParenthesisGeneration {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Generated parenthesis are: " + generateParenthesis(n));
    }

    private static List<String> generateParenthesis(int n) {
        Stack<Character> stack = new Stack<>();
        List<String> res = new ArrayList<>();
        backTrack(0, 0, n, stack, res);
        return res;
    }

    private static void backTrack(int openN, int closedN, int n, Stack<Character> stack, List<String> res) {
        if (openN == closedN && closedN == n) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Character c : stack) {
                stringBuilder.append(c);
            }
            res.add(stringBuilder.toString());
        }
        if (openN < n) {
            stack.push('(');
            backTrack(openN + 1, closedN, n, stack, res);
            stack.pop();
        }
        if (closedN < openN) {
            stack.push(')');
            backTrack(openN, closedN + 1, n, stack, res);
            stack.pop();
        }
    }
}
