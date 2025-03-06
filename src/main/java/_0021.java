// https://leetcode.com/problems/merge-two-sorted-lists

import helpers.ListNode;

public class _0021 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = null;
        ListNode current = null;

        while (list1 != null && list2 != null) {
            ListNode newNode = new ListNode();
            if (list1.val < list2.val) {
                newNode.val = list1.val;
                list1 = list1.next;
            } else {
                newNode.val = list2.val;
                list2 = list2.next;
            }

            if (head == null) {
                head = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = current.next;
            }
        }

        while (list1 != null) {
            ListNode newNode = new ListNode(list1.val);
            list1 = list1.next;

            if (head == null) {
                head = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = current.next;
            }
        }

        while (list2 != null) {
            ListNode newNode = new ListNode(list2.val);
            list2 = list2.next;

            if (head == null) {
                head = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        final var solution = new _0021();
        solution.mergeTwoLists(
                new ListNode(1, new ListNode(2, new ListNode(3))),
                new ListNode(1, new ListNode(3, new ListNode(4))));
    }
}
