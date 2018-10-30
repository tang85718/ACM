package com.company.leetcode;


public class ReverseList {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode reverse(ListNode head, ListNode prev) {
        if (head.next != null) {
            ListNode tail = reverse(head.next, head);
            head.next = prev;
            return tail;
        }

        head.next = prev;
        return head;
    }

    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }

    public static ListNode createList() {
        int[] t1 = new int[]{1, 2, 3, 4, 5};
        ListNode head = new ListNode(t1[0]);

        ListNode cur = head;
        for (int i = 1; i < t1.length; i++) {
            cur.next = new ListNode(t1[i]);
            cur = cur.next;
        }

        return head;
    }

    public static void showList(ListNode head) {
        if (head == null) {
            System.out.println();
            return;
        }

        System.out.print(head.val);
        System.out.print(",");

        showList(head.next);
    }

    public static void main(String[] args) {
        ListNode head = createList();
        showList(head);

        ReverseList reverseList = new ReverseList();
        ListNode ret = reverseList.reverseList(head);
        showList(ret);
    }
}
