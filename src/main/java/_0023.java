// https://leetcode.com/problems/merge-k-sorted-lists/

import helpers.ListNode;

public class _0023 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        boolean found = false;
        for (ListNode list : lists) {
            if (list != null) {
                found = true;
            }
        }

        if (!found) {
            return null;
        }

        ListNode head = null;
        ListNode current = null;

        while (true) {
            int min = Integer.MAX_VALUE;
            int index = -1;
            for (int i = 0; i < lists.length; i ++) {
                ListNode list = lists[i];
                if (list != null && list.val < min) {
                    min = list.val;
                    index = i;
                }
            }

            if (index == -1) {
                break;
            } else {
                lists[index] = lists[index].next;
            }

            if (head == null) {
                head = new ListNode(min);
                current = head;
            } else {
                current.next = new ListNode(min);
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        final var solution = new _0023();
        ListNode[] lists = new ListNode[] {
            new ListNode(1, new ListNode(4, new ListNode(5))),
            new ListNode(1, new ListNode(3, new ListNode(4))),
            new ListNode(2, new ListNode(6))
        };
        solution.mergeKLists(lists).print();
    }

}
