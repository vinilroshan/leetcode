// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

import helpers.ListNode;

public class _0019 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length ++;
            temp = temp.next;
        }

        int target = length - n;
        if (target < 0) {
            return null;
        } else if (target == 0) {
            return head.next;
        }
        
        temp = head;
        for (int i = 1; i < target; i ++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        final var solution = new _0019();
        ListNode head = null;
        //ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7)))))));
        //solution.removeNthFromEnd(head, 4).print();
        // head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7)))))));
        // solution.removeNthFromEnd(head, 7).print();
        // head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7)))))));
        // solution.removeNthFromEnd(head, 1).print();
        head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7)))))));
        solution.removeNthFromEnd(head, 8).print();
    }   
}
