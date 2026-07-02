package easy;

import java.util.ArrayList;
import java.util.List;

public class _145_BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        this.postorder(root, list);
        return list;
    }

    public void postorder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;
        this.postorder(root.left, list);
        this.postorder(root.right, list);
        list.add(root.val);
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



