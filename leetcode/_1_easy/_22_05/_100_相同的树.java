package com.mu;

/*

给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。

示例 1：
输入：p = [1,2,3], q = [1,2,3]
输出：true

 */

import java.util.List;

public class _100_相同的树 {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(5, null, null);
        TreeNode treeNode2 = new TreeNode(4, null, null);
        TreeNode treeNode3 = new TreeNode(3, treeNode1, null);
        TreeNode treeNode4 = new TreeNode(2, null, treeNode2);
        TreeNode treeNode5 = new TreeNode(1, treeNode4, treeNode3);

        TreeNode treeNode6 = new TreeNode(6, null, null);
        TreeNode treeNode7 = new TreeNode(4, null, null);
        TreeNode treeNode8 = new TreeNode(3, treeNode6, null);
        TreeNode treeNode9 = new TreeNode(2, null, treeNode7);
        TreeNode treeNode10 = new TreeNode(1, treeNode9, treeNode8);

        boolean isSameTree = new Solution().isSameTree(treeNode5,treeNode10);
        System.out.println(isSameTree);
    }

    static class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null) return q == null;
            return q != null && p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
