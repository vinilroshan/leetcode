import helpers.ListNode;

// https://leetcode.com/problems/add-two-numbers/description/
public class _0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var carry = 0;
        ListNode current = null;
        ListNode head = null;

        while (l1 != null || l2 != null) {
            var sum = 0;
            if (l1 != null && l2 != null) {
                sum = l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                sum = l1.val;
                l1 = l1.next;
            } else {
                sum = l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum / 10;
            final var node = new ListNode(sum % 10);
            if (current == null) {
                head = node;
            } else {
                current.next = node;
            }
            current = node;
        }

        if (carry != 0) {
            current.next = new ListNode(carry);
        }

        return head;
    }

    public static void main(String[] args) {
        final var solution = new _0002();
        solution.addTwoNumbers(new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))),
                new ListNode(9, new ListNode(9, new ListNode(9)))).print();
    }
}
