package com.mu;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

import com.mu.printer.BinaryTreeInfo;
public class SearchBinaryTree<E> implements BinaryTreeInfo {
    private int size;
    private Node<E> root;
    private Comparator<E> comparator;

    public SearchBinaryTree(){
        this(null);
    }

    public SearchBinaryTree(Comparator<E> comparator){
        this.comparator = comparator;
    }
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

    //添加元素
    public void add(E element) {
        elementNotNullCheck(element);
        //添加根节点
        if (root == null) {
            root = new Node<E>(element, null);
            size++;
            return;
        }
        //添加非第一个元素

        Node<E> parent = root;
        Node<E> node = root;
        int cmp = 0;
        while (node != null) {
            cmp = compare(element, node.element);
            parent = node;
            if (cmp > 0) {
                node = node.right;
            } else if (cmp < 0) {
                node = node.left;
            } else {
                node.element = element;
                return;
            }
        }

        // 看看插入到父节点的哪个位置
        Node<E> newNode = new Node<>(element, parent);
        if (cmp > 0) {
            parent.right = newNode;
        } else {
            parent.left = newNode;
        }
        size++;
    }

    //比较
    public int compare(E e1, E e2) {
        if (comparator != null) {
            return comparator.compare(e1, e2);
        }
        return ((Comparable<E>) e1).compareTo(e2);
    }

    //删除元素
    public void remove(E element) {
        remove(node(element));
    }

    public void remove(Node<E> node){
        if(node == null) return;
        size--;

        if (node.hasTwoChildren()){ //度为2的节点
            //找到后继节点
            Node<E> s = successor(node);
            //用后继节点覆盖度为2的节点的值
            node.element = s.element;
            //删除后继节点
            node = s;
        }

        // 删除node节点（node的度必然是1或者0）
        Node<E> replacement = node.left != null ? node.left:node.right;

        if (replacement != null){ // node是度为1的节点
            // 更改parent
            replacement.parent = node.parent;
            // 更改parent的left、right的指向
            if (node.parent == null){ // node是度为1的节点并且是根节点
                root = replacement;
            } else if (node == node.parent.left){
                node.parent.left = replacement;
            } else { // node == node.parent.right
                node.parent.right = replacement;
            }
        } else if(node.parent == null){ // node是叶子节点并且是根节点
            root = null;
        } else { // node是叶子节点，但不是根节点
            if (node == node.parent.left){
                node.parent.left = null;
            } else { // node == node.parent.right
                node.parent.right = null;
            }
        }
    }

    public Node<E> node(E element){
        Node<E> node = root;
        while (node != null){
            int cmp = compare(element,node.element);
            if (cmp == 0) return node;
            if (cmp > 0){
                node = node.right;
            } else { //cmp < 0
                node = node.left;
            }
        }
        return null;
    }

    //是否包含某元素
    public boolean contains(E element) {
        return node(element)!=null;
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

    public E predecessor(E element){
        Node<E> node = predecessor(node(element));
        return node.element;
    }

    public Node<E> predecessor(Node<E> node){
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

    private Node<E> successor(Node<E> node) {
        if (node == null) return null;

        // 前驱节点在左子树当中（right.left.left.left....）
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

    public void elementNotNullCheck(E element) {
        if (element == null) {
            throw new IllegalArgumentException("Element must not be null!");
        }
    }

    public static class Node<E> {
        E element;
        Node<E> left;
        Node<E> right;
        Node<E> parent;

        public boolean isLeaf(){
            return (left == null && right == null);
        }
        public Node(E element, Node<E> parent) {
            this.element = element;
            this.parent = parent;
        }

        public boolean hasTwoChildren(){
            return right != null && left != null;
        }

    }

    @Override
    public Object root() {
        return root;
    }

    @Override
    public Object left(Object node) {
        return ((Node<E>) node).left;
    }

    @Override
    public Object right(Object node) {
        return ((Node<E>) node).right;
    }

    @Override
    public Object string(Object node) {
        Node<E> myNode = (Node<E>) node;
        String parentString = "null";
        if (myNode.parent != null) {
            parentString = myNode.parent.element.toString();
        }
        return myNode.element;
    }
}
