package tree;

/**
 * @Author Md. Aslam Hossain
 * @Date Oct 25, 2024
 */
public class SameTree {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        System.out.println("Is same tree: " + isSameTree(p, q));
    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        return dfs(p, q);
    }

    private static boolean dfs(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        boolean left = dfs(p.left, q.left);
        boolean right = dfs(p.right, q.right);
        return left && right;
    }
}
