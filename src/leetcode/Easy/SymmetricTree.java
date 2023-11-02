package leetcode.Easy;

public class SymmetricTree {

    public static void main(String[] args) {
        TreeNode treeNode2 = new TreeNode(2, new TreeNode(3),new TreeNode(4));

        TreeNode treeNode3 = new TreeNode(2, new TreeNode(4),new TreeNode(3));

        TreeNode treeNode1 = new TreeNode(1, treeNode2 , treeNode3);

        System.out.println(isSymmetric(treeNode1));
    }

    public static boolean isSymmetric(TreeNode root) {

        if (root == null) return true;

       return helper(root.left, root.right);

    }

    public static boolean helper(TreeNode left, TreeNode right) {

        if (left == null && right == null) return true;

        if (left == null || right == null) return false;

        return left.val == right.val && helper(left.left, right.right) && helper(left.right , right.left);
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
