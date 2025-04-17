// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list

import helpers.ListNode;

public class _2095 {

    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            head = null;
        } else if (head.next.next == null) {
            head.next = null;
        } else {
            ListNode slow = head;
            ListNode slowPrev = slow;
            ListNode fast = head;

            while (fast.next != null && fast.next.next != null) {
                slowPrev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }

            if (fast.next == null) {
                slowPrev.next = slow.next;
            } else if (fast.next.next == null) {
                slow.next = slow.next.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        var solution = new _2095();
        solution.deleteMiddle(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))))).print();
    }

}
