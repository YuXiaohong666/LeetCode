package easy;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _94BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(list, root);
        return list;
    }

    public void inOrder(List<Integer> list, TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(list, node.left);
        list.add(node.val);
        inOrder(list, node.right);
    }
}
