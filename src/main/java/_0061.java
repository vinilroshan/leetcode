import helpers.ListNode;

// https://leetcode.com/problems/rotate-list/description/
public class _0061 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        var size = 0;
        var temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        k = k % size;
        if (k == 0) {
            return head;
        }
        var prev = head;
        temp = head;
        for (var i = 0; i < size - k; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        final var result = temp;

        while (temp != null && temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        return result;
    }

    public static void main(String[] args) {
        final var solution = new _0061();
        solution.rotateRight(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))), 8).print();
        solution.rotateRight(new ListNode(1, new ListNode(2)), 7).print();
    }
}
