package src.com.mu;

/*

给你一个二叉树的根节点 root ， 检查它是否轴对称。

示例 1：
           1
       ____|____
      |         |
      2         2
    __|__     __|__
   |     |   |     |
   3     4   4     3

输入：root = [1,2,2,3,4,4,3]
输出：true

 */
public class _101_对称二叉树 {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(3, null, null);
        TreeNode treeNode2 = new TreeNode(4, null, null);
        TreeNode treeNode3 = new TreeNode(4, null, null);
        TreeNode treeNode4 = new TreeNode(3, null, null);
        TreeNode treeNode5 = new TreeNode(2, treeNode2, treeNode1);
        TreeNode treeNode6 = new TreeNode(2, treeNode4, treeNode3);
        TreeNode treeNode7 = new TreeNode(1, treeNode6, treeNode5);

        boolean isSameTree = new Solution().isSymmetric(treeNode7);
        System.out.println(isSameTree);
    }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return dfs(root.left,root.right);
    }

    public boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;
        return dfs(left.left,right.right) && dfs(left.right,right.left);
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

