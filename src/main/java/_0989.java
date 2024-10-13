import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/add-to-array-form-of-integer/description
public class _0989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        final var result = new LinkedList<Integer>();
        var index = num.length - 1;
        var carry = 0;

        while (index >= 0 || k > 0) {
            var sum = carry;
            if (k > 0) {
                sum += k % 10;
                k = k / 10;
            }
            if (index >= 0) {
                sum += num[index--];
            }
            result.addFirst(sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) {
            result.addFirst(carry);
        }
        return result;
    }

    public static void main(String[] args) {
        final var solution = new _0989();
        System.out.println(solution.addToArrayForm(new int[]{2, 1, 5}, 806));
        System.out.println(solution.addToArrayForm(new int[]{0}, 806));
    }
}
