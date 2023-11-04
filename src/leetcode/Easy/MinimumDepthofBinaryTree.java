package leetcode.Easy;

public class MinimumDepthofBinaryTree {

    public static void main(String[] args) {
        TreeNode treeNode2 = new TreeNode(2, new TreeNode(3),new TreeNode(4));

        TreeNode treeNode4 = new TreeNode(2, new TreeNode(4),new TreeNode(3));

        TreeNode treeNode3 = new TreeNode(2, new TreeNode(4), treeNode4);

        TreeNode treeNode1 = new TreeNode(1, treeNode2 , treeNode3);

        System.out.println(minDepth(treeNode1));
    }

    public static int minDepth(TreeNode root) {

        if (root == null) return 0;

        int left = minDepth(root.left);

        int right = minDepth(root.right);

        if (left == 0 || right == 0) return Math.max(left,right) + 1;

        return Math.min(left, right) + 1;

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
