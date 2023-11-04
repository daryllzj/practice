package leetcode.Easy;

public class PathSum {

    public static void main(String[] args) {
        TreeNode treeNode2 = new TreeNode(2, new TreeNode(3),new TreeNode(4));

        TreeNode treeNode4 = new TreeNode(2, new TreeNode(4),new TreeNode(3));

        TreeNode treeNode3 = new TreeNode(2, new TreeNode(4), treeNode4);

        TreeNode treeNode1 = new TreeNode(1, treeNode2 , treeNode3);

        System.out.println(hasPathSum(treeNode1, 6));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        return sum(root, targetSum, 0);
    }

    public static boolean sum(TreeNode root, int targetSum, int currentSum) {

        if (root == null) return false;

        if (root.left == null && root.right == null)
            return root.val + currentSum == targetSum;

        return sum(root.left, targetSum, currentSum + root.val) || sum(root.right, targetSum, currentSum + root.val);

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
