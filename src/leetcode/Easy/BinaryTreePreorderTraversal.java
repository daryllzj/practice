package leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    public static void main(String[] args) {
        TreeNode treeNode2 = new TreeNode(2, new TreeNode(3),new TreeNode(4));

        TreeNode treeNode4 = new TreeNode(2, new TreeNode(4),new TreeNode(3));

        TreeNode treeNode3 = new TreeNode(2, new TreeNode(4), treeNode4);

        TreeNode treeNode1 = new TreeNode(1, treeNode2 , treeNode3);

        System.out.println(preorderTraversal(treeNode1));
    }

    public static List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> array = new ArrayList<>();

        return traverse(root, array);

    }

    public static List<Integer> traverse(TreeNode root, List<Integer> array){

        if (root != null) {
            array.add(root.val);
            traverse(root.left, array);
            traverse(root.right, array);
        }

        return array;
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
