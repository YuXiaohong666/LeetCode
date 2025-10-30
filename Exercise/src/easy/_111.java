package easy;

import DataStructure.TreeNode;

/**
 * 111. 二叉树的最小深度
 * 简单
 * <p>
 * 给定一个二叉树，找出其最小深度。
 * <p>
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * <p>
 * 说明：叶子节点是指没有子节点的节点。
 */
public class _111 {
    public int minDepth(TreeNode root) {
        return search(root, 0);
    }

    public int search(TreeNode root, int length) {
        if (root == null) return length;
        if (root.left == null && root.right == null) {
            return ++length;
        } else {
            length++;
            if (root.left == null) {
                return search(root.right, length);
            } else if (root.right == null) {
                return search(root.left, length);
            } else {
                return Math.min(search(root.left, length), search(root.right, length));
            }
        }
    }
}
