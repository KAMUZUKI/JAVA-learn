package _1_easy._22_04;

/*
将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。

示例 1：
输入：l1 = [1,2,4], l2 = [1,3,4]
输出：[1,1,2,3,4,4]
 */

public class _21_合并两个有序链表 {
    public static void main(String[] args) {
        ListNode l3 = new ListNode(8);
        ListNode l4 = new ListNode(7);
        ListNode l1 = new ListNode(1,l3);
        ListNode l2 = new ListNode(2,l4);

        ListNode ret = new Solution().mergeTwoLists(l1,l2);
        while (ret != null){
            System.out.print(ret);
            ret = ret.next;
        }

    }

    static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            // 迭代方法
            ListNode prehead = new ListNode(-1);
            ListNode prev = prehead;
            while (list1 != null && list2 != null){
                if (list1.val < list2.val){
                    prev.next = list1;
                    list1 = list1.next;
                } else{
                    prev.next = list2;
                    list2 = list2.next;
                }
                prev = prev.next;
            }
            prev.next = list1 == null ? list2:list1;
            return prehead.next;
            /*
            //  递归方法
            if (list1 == null){
                return list2;
            } else if (list2 == null){
                return list1;
            } else if (list1.val <list2.val){
                list1.next = mergeTwoLists(list1.next,list2);
                return list1;
            } else{
                list2.next = mergeTwoLists(list2.next,list1);
                return list2;
            }
            */
        }
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return val + " ";
        }
    }
}

//Definition for singly-linked list.
