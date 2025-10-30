package easy;

import DataStructure.TreeNode;

/**
 * 112. 路径总和
 * 简单
 * <p>
 * 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum 。判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。如果存在，返回 true ；否则，返回 false 。
 * <p>
 * 叶子节点 是指没有子节点的节点。
 */
public class _112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return search(root, targetSum, 0);
    }

    public boolean search(TreeNode root, int targetSum, int value) {
        value += root.val;
        if (root.left == null && root.right == null) {
            // 找到了叶子节点
            return value == targetSum;
        } else {
            if (root.left == null) {
                return search(root.right, targetSum, value);
            } else if (root.right == null) {
                return search(root.left, targetSum, value);
            } else {
                return search(root.left, targetSum, value) || search(root.right, targetSum, value);
            }
        }
    }
}
