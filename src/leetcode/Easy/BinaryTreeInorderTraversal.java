package leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public static void main(String[] args) {
        TreeNode treeNode;

        treeNode = new TreeNode(1);

        treeNode.right = new TreeNode(2);

        treeNode.right.left = new TreeNode(3);


        System.out.println(inorderTraversal(treeNode));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> answer = new ArrayList<>();
        helper(root, answer);
        return answer;
    }

    private static void helper (TreeNode treeNode, List<Integer> ans){
        if (treeNode == null) return;

        helper(treeNode.left, ans);
        ans.add(treeNode.val);
        helper(treeNode.right, ans);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

    }

}
