package leetcode.Easy;

public class BalancedBinaryTree {

    public static void main(String[] args) {
        TreeNode treeNode2 = new TreeNode(2, new TreeNode(3),new TreeNode(4));

        TreeNode treeNode4 = new TreeNode(2, new TreeNode(4),new TreeNode(3));

        TreeNode treeNode3 = new TreeNode(2, new TreeNode(4), treeNode4);

        TreeNode treeNode1 = new TreeNode(1, treeNode2 , treeNode3);

        System.out.println(isBalanced(treeNode1));
    }

    public static boolean isBalanced(TreeNode root) {

        return height(root) > 0;

    }

    public static int height(TreeNode root) {

        if (root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);
        if (left == -1 || right == -1) return -1;

        if (Math.abs(left - right) > 1) {
            return -1;
        } else return Math.max(left,right) + 1;

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
