package easy;

import DataStructure.TreeNode;

/**
 * 104. 二叉树的最大深度
 * 简单
 * <p>
 * 给定一个二叉树 root ，返回其最大深度。
 * <p>
 * 二叉树的 最大深度 是指从根节点到最远叶子节点的最长路径上的节点数。
 */
public class _104 {
    public int maxDepth(TreeNode root) {
        return search(root, 0);
    }

    public int search(TreeNode root, int length) {
        if (root == null) {
            return length;
        } else {
            length++;
            return Math.max(search(root.left, length), search(root.right, length));
        }
    }
}
