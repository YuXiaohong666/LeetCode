package easy;

import DataStructure.TreeNode;

/**
 * 101. 对称二叉树
 * 简单
 * <p>
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 */
public class _101 {
    public boolean isSymmetric(TreeNode root) {
        return search(root.left, root.right);
    }

    public boolean search(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        } else if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            return search(root1.left, root2.right) && (search(root1.right, root2.left));
        } else {
            return false;
        }
    }
}
