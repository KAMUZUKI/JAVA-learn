package com.mu;

/*

给定一个已排序的链表的头head，删除所有重复的元素，使每个元素只出现一次。返回 已排序的链表。

示例 1：
输入：head = [1,1,2]
输出：[1,2]

 */

import java.util.HashSet;
import java.util.Set;

public class _83_删除排序链表中的重复元素 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1,null);
        ListNode listNode2 = new ListNode(3,listNode1);
        ListNode listNode3 = new ListNode(1,listNode2);
        ListNode listNode4 = new ListNode(1,listNode3);
        ListNode listNode5 = new ListNode(1,listNode4);
        ListNode listNode6 = new ListNode(6,listNode5);
        ListNode listNode7 = new ListNode(6,listNode6);
        ListNode listNode8 = new ListNode(3,listNode7);
        ListNode list = new Solution().deleteDuplicates(listNode8);
        while (list != null){
            System.out.println(list.val);
            list = list.next;
        }

    }
    //    f     t
    //    |     |
    //  6 1 1 1 3 1
    //    |_____|
    //
    static class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            // 对于乱序的链表
            if (head == null) return head;
            Set<Integer> set = new HashSet();
            ListNode fNode = null;
            ListNode tmpNode = head;
            boolean flag = true;
            while(tmpNode != null) {
                if (set.contains(tmpNode.val)) {
                    fNode.next = tmpNode.next;
                    //tmpNode.next = null;
                    flag = false;
                } else {
                    set.add(tmpNode.val);
                    flag = true;
                }
                if (flag) {
                    fNode = tmpNode;
                }
                tmpNode = tmpNode.next;
            }
            // 对于已排序的链表
//            while (tmpNode.next != null){
//
//                if (tmpNode.val == tmpNode.next.val) {
//                    tmpNode.next = tmpNode.next.next;
//                } else {
//                    tmpNode = tmpNode.next;
//                }
//            }
            return head;
        }
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
