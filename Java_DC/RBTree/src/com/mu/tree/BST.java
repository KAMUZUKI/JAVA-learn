package com.mu.tree;

import java.util.Comparator;

public class BST<E> extends BinaryTree<E> {
    private Comparator<E> comparator;

    public BST(){
        this(null);
    }

    //是否包含某元素
    public boolean contains(E element) {
        return node(element)!=null;
    }

    protected E predecessor(E element){
        Node<E> node = predecessor(node(element));
        return node.element;
    }

    /**
     * 添加node之后的调整
     * @param node 新添加的节点
     */
    protected void afterAdd(Node<E> node) { }

    /**
     * 删除node之后的调整
     * @param node 被删除的节点
     */
    protected void afterRemove(Node<E> node) { }

    public BST(Comparator<E> comparator){
        this.comparator = comparator;
    }
    //添加元素
    public void add(E element) {
        elementNotNullCheck(element);
        //添加根节点
        if (root == null) {
            root = createNode(element, null);
            size++;

            // 新添加节点之后的处理
            afterAdd(root);
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
        Node<E> newNode = createNode(element, parent);
        if (cmp > 0) {
            parent.right = newNode;
        } else {
            parent.left = newNode;
        }
        size++;

        // 新添加节点之后的处理
        afterAdd(newNode);
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

            // 删除节点之后的处理
            afterRemove(replacement);
        } else if(node.parent == null){ // node是叶子节点并且是根节点
            root = null;

            // 删除节点之后的处理
            afterRemove(node);
        } else { // node是叶子节点，但不是根节点
            if (node == node.parent.left){
                node.parent.left = null;
            } else { // node == node.parent.right
                node.parent.right = null;
            }

            // 删除节点之后的处理
            afterRemove(node);
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

    //比较
    public int compare(E e1, E e2) {
        if (comparator != null) {
            return comparator.compare(e1, e2);
        }
        return ((Comparable<E>) e1).compareTo(e2);
    }

    public void elementNotNullCheck(E element) {
        if (element == null) {
            throw new IllegalArgumentException("Element must not be null!");
        }
    }

    @Override
    public String toString() {
        return "BST{" +
                "=" +  +
                '}';
    }
}
