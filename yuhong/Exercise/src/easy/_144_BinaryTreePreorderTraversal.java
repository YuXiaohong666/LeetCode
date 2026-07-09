package easy;

import java.util.ArrayList;
import java.util.List;

public class _144_BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        this.preorder(root, list);
        return list;
    }

    public void preorder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;
        list.add(root.val);
        this.preorder(root.left, list);
        this.preorder(root.right, list);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

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


