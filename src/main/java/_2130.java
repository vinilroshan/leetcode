// https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description

import helpers.ListNode;

public class _2130 {

    public int pairSum(ListNode head) {
        int max = Integer.MIN_VALUE;
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode current = slow.next;
        ListNode temp = null;
        ListNode newHead = null;
        
        while (current != null) {
            temp = current;
            current = current.next;

            temp.next = newHead;
            newHead = temp;
        }

        while (newHead != null) {
            int sum = head.val + newHead.val;
            max = Math.max(max, sum);

            head = head.next;
            newHead = newHead.next;
        }

        return max;
    }

    public static void main(String[] args) {

    }

}
