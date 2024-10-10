package helpers;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void print() {
        var temp = this;
        while (temp != null) {
            System.out.print(temp.val + ",");
            temp = temp.next;
        }
    }
}