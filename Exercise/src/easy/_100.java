package easy;

import DataStructure.TreeNode;

/**
 *
 * 100. 相同的树
 * 简单
 * <p>
 * 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
 * <p>
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 */
public class _100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 前序遍历比较是否都相同
        return search(p, q);
    }

    public boolean search(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        } else if (root1 == null || root2 == null) {
            return false;
        } else {
            if (root1.val == root2.val) {
                return search(root1.left, root2.left) && search(root1.right, root2.right);
            } else {
                return false;
            }
        }
    }
}

