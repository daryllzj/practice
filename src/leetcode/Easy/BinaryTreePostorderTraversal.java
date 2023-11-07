package leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

    public static void main(String[] args) {
        TreeNode treeNode2 = new TreeNode(2, new TreeNode(3),new TreeNode(4));

        TreeNode treeNode4 = new TreeNode(2, new TreeNode(4),new TreeNode(3));

        TreeNode treeNode3 = new TreeNode(2, new TreeNode(4), treeNode4);

        TreeNode treeNode1 = new TreeNode(1, treeNode2 , treeNode3);

        System.out.println(postorderTraversal(treeNode1));
    }

    public static List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> array = new ArrayList<>();

        traverse(root, array);

        return array;
    }

    public static void traverse(TreeNode root, List<Integer> array){

        if (root == null ) {
            return;
        }
            traverse(root.left, array);
            traverse(root.right, array);
            array.add(root.val);
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
