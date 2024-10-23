package tree;

/**
 * @Author Md. Aslam Hossain
 * @Date Oct 23, 2024
 */
public class Diameter {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        Solution solution = new Solution();
        System.out.println("Diameter is: " + solution.diameterOfBinaryTree(root));
    }

    private static class Solution {
        int result = -1;

        private int diameterOfBinaryTree(TreeNode root) {
            dfs(root);
            return result;
        }

        private int dfs(TreeNode current) {
            if (current == null) return -1;
            int left = 1 + dfs(current.left);
            int right = 1 + dfs(current.right);
            result = Math.max(result, (left + right));
            return Math.max(left, right);
        }
    }

}
