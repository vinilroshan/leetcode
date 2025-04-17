// https://leetcode.com/problems/reverse-linked-list/description

import helpers.ListNode;

public class _0206 {

    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode temp = null;
        ListNode newHead = null;
        
        while (current != null) {
            temp = current;
            current = current.next;

            temp.next = newHead;
            newHead = temp;
        }

        return newHead;
    }

    public static void main(String[] args) {
        final var solution = new _0206();
        solution.reverseList(new ListNode(1, new ListNode(2, new ListNode(3)))).print();
    }

}
