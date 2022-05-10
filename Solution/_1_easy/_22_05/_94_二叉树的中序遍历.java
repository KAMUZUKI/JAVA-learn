package src.com.mu.project19_io;

import java.util.ArrayList;
import java.util.List;

public class _94_二叉树的中序遍历 {
    //              1
    //          ____|____
    //         |         |
    //         2         3
    //         |__     __|
    //            |   |
    //            4   5
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(5, null, null);
        TreeNode treeNode2 = new TreeNode(4, null, null);
        TreeNode treeNode3 = new TreeNode(3, treeNode1, null);
        TreeNode treeNode4 = new TreeNode(2, null, treeNode2);
        TreeNode treeNode5 = new TreeNode(1, treeNode4, treeNode3);
        List<Integer> list = new Solution().inorderTraversal(treeNode5);
        list.forEach((i) -> {
            System.out.println(i + ", ");
        });
    }

    static class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<Integer>();
            inorder(root, res);
            return res;
        }

        public void inorder(TreeNode root, List<Integer> res) {
            if (root == null) {
                return;
            }
            inorder(root.left, res);
            res.add(root.val);
            inorder(root.right, res);
        }
    }
//            if (root != null){
//                list.add(root.val);
//            }
//            if (root != null){
//                inorderTraversal(root.left);
//            }
//            if(root != null){
//                inorderTraversal(root.right);
//            }
//            return list;
//        }


    static class TreeNode {
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