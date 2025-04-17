// https://leetcode.com/problems/odd-even-linked-list/description

import helpers.ListNode;

public class _0328 {

    public ListNode oddEvenList(ListNode head) {
        if (head != null && head.next != null) {
            ListNode oddEnd = head;
            ListNode evenStart = head.next;
            ListNode evenEnd = head.next;
            ListNode current = head.next.next;
            int index = 3;

            while (current != null) {
                if (index % 2 == 0) {
                    evenEnd.next = current;
                    evenEnd = evenEnd.next;
                } else {
                    oddEnd.next = current;
                    oddEnd = oddEnd.next;
                }
                index ++;
                current = current.next;
            }

            oddEnd.next = evenStart;
            evenEnd.next = null;
        }
        return head;
    }

    public static void main(String[] args) {
        var solution = new _0328();
        solution.oddEvenList(new ListNode(2,
                new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(7))))))))
                .print();
    }

}
