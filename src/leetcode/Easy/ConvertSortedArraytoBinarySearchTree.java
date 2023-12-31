package leetcode.Easy;

public class ConvertSortedArraytoBinarySearchTree {

    public static void main(String[] args) {

        int[] nums = {-10,-3,0,5,9};
        TreeNode treeNode = sortedArrayToBST(nums);

    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return createIntoTreeNode(nums, 0, nums.length-1);
    }

    public static TreeNode createIntoTreeNode(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = (left + right)/2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = createIntoTreeNode(nums, left, mid -1);
        root.right = createIntoTreeNode(nums, mid + 1, right);

        return root;
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
