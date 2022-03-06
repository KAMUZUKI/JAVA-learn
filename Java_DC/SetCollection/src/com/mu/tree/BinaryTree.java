package com.mu.tree;

import java.util.LinkedList;
import java.util.Queue;
public class BinaryTree<E>{
    protected int size;
    protected Node<E> root;

    //获取元素的数量
    public int getSize() {
        return size;
    }

    //是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //清空所有的元素
    public void clear() {
        root = null;
        size = 0;
    }

//    //前序遍历
//    public void preorderTraversal(){
//        preorderTraversal(root);
//    }
//
//    public void preorderTraversal(Node<E> node){
//        if (node == null) return;
//        System.out.println(node.element);
//        preorderTraversal(node.left);
//        preorderTraversal(node.right);
//    }
//
//    //中序遍历
//    public void inorderTraversal(){
//        inorderTraversal(root);
//                }
//
//    public void inorderTraversal(Node<E> node){
//        if (node == null) return;
//
//        inorderTraversal(node.left);
//        System.out.println(node.element);
//        inorderTraversal(node.right);
//    }
//
//    //后序遍历
//    public void postTraversal(){
//        postTraversal(root);
//    }
//
//    public void postTraversal(Node<E> node){
//        if (node == null) return;
//        postTraversal(node.left);
//        postTraversal(node.right);
//        System.out.println(node.element);
//    }

    //层序遍历
//    public void levelTraversal(){
//        if (root == null) return;
//        Queue<Node<E>> queue = new LinkedList<>();
//        queue.offer(root);
//        while (!queue.isEmpty()){
//            Node<E> node = queue.poll();
//            if (node.left != null){
//                queue.offer(node.left);
//            }
//
//            if (node.right != null){
//                queue.offer(node.right);
//            }
//            System.out.println(node.element);
//        }
//    }

    //前序遍历
    public void preorder(Visitor<E> visitor){
        if (visitor == null) return;
        preorder(root,visitor);
    }

    public void preorder(Node<E> node,Visitor<E> visitor){
        if (node == null || visitor.stop) return;
        if (visitor.visit(node.element)) return;
        preorder(node.left,visitor);
        preorder(node.right,visitor);
    }

    //中序遍历
    public void inorder(Visitor<E> visitor){
        if (visitor == null) return;
        inorder(root,visitor);
    }

    public void inorder(Node<E> node,Visitor<E> visitor){
        if (node == null || visitor.stop) return;
        inorder(node.left,visitor);
        if (visitor.visit(node.element)) return;
        inorder(node.right,visitor);
    }

    //后序遍历
    public void postorder(Visitor<E> visitor){
        if (visitor == null) return;
        postorder(root,visitor);
    }

    public void postorder(Node<E> node,Visitor<E> visitor){
        if (node == null || visitor.stop) return;
        postorder(node.left,visitor);
        postorder(node.right,visitor);

        if (visitor.stop) return;
        visitor.stop = visitor.visit(node.element);
    }

    //层序遍历
    public void levelOrder(Visitor<E> visitor){
        if (root == null || visitor == null) return;
        Queue<Node<E>> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Node<E> node = queue.poll();
            if (visitor.visit(node.element)) return;
            if (node.left != null){
                queue.offer(node.left);
            }

            if (node.right != null){
                queue.offer(node.right);
            }
        }
    }

    //获取高度

    public int height(){
        if (root == null) return 0;
        //树的高度
        int height = 0;
        int rowSize = 1;
        Queue<Node<E>> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Node<E> node = queue.poll();
            rowSize--;
            if (node.left != null){
                queue.offer(node.left);
            }

            if (node.right != null){
                queue.offer(node.right);
            }

            if (rowSize == 0){
                rowSize = queue.size();
                height++;
            }
        }
        return height;
    }
     public int height2(){
        return height2(root);
     }

     public int height2(Node<E> node){
        if (node == null) return 0;
        return 1 + Math.max(height2(node.left), height2(node.right));
     }

    protected Node<E> createNode(E element, Node<E> parent) {
        return new Node<>(element, parent);
    }

    public static abstract class Visitor<E>{
        boolean stop;
        public abstract boolean visit(E element);
    }

    //判断是否为完全二叉树
    public boolean isCompelte(){
        if (root == null) return false;
        Queue<Node<E>> queue = new LinkedList<>();
        queue.offer(root);

        boolean leaf = false;
        while(!queue.isEmpty()){
            Node<E> node = queue.poll();
            if (leaf && !node.isLeaf()) return false;

            if (node.left != null){
                queue.offer(node.left);
            } else if (node.right != null){
                //node.left == null && node.right != null
                return true;
            }
            if (node.right != null){
                queue.offer(node.right);
            } else {
                //node.right == null
                leaf = true;
            }
        }
        return true;
    }

    //前驱结点
    protected Node<E> predecessor(Node<E> node){
        if (node == null) return null;
        // 前驱节点在左子树当中（left.right.right.right....）
        Node<E> p = node.left;
        if (p != null){
            while(p.right != null){
                p = p.right;
            }
            return p;
        }

        // 从父节点、祖父节点中寻找前驱节点
        while( node.parent != null && node == node.parent.left ){
            node = node.parent;
        }
        return node.parent;
    }

    //后继节点
    protected Node<E> successor(Node<E> node) {
        if (node == null) return null;

        // 后继节点在左子树当中（right.left.left.left....）
        Node<E> p = node.right;
        if (p != null) {
            while (p.left != null) {
                p = p.left;
            }
            return p;
        }

        // 从父节点、祖父节点中寻找前驱节点
        while (node.parent != null && node == node.parent.right) {
            node = node.parent;
        }

        return node.parent;
    }



    public static class Node<E> {
        E element;
        Node<E> left;
        Node<E> right;
        Node<E> parent;

        public Node(E element, Node<E> parent) {
            this.element = element;
            this.parent = parent;
        }

        public boolean isLeaf(){
            return (left == null && right == null);
        }

        public boolean hasTwoChildren(){
            return right != null && left != null;
        }

        public boolean isLeftChild() {
            return parent != null && this == parent.left;
        }

        public boolean isRightChild() {
            return parent != null && this == parent.right;
        }

        public Node<E> sibling() {
            if (isLeftChild()) {
                return parent.right;
            }

            if (isRightChild()) {
                return parent.left;
            }
            return null;
        }
    }
}
