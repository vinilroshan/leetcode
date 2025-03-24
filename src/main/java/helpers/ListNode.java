package helpers;

import java.util.StringJoiner;

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
        var sj = new StringJoiner(",");
        while (temp != null) {
            sj.add(String.valueOf(temp.val));
            temp = temp.next;
        }
        System.out.println(sj.toString());
    }
}