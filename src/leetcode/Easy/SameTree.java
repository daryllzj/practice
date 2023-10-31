package leetcode.Easy;

public class SameTree {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1, new TreeNode(2),new TreeNode(1));

        TreeNode treeNode2 = new TreeNode(1, new TreeNode(1),new TreeNode(2));

        System.out.println(isSameTree(treeNode1,treeNode2));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;

        if (p == null || q == null) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
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
