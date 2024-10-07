import java.util.Arrays;

public class _0066 {
    public int[] plusOne(int[] digits) {
        var carry = 1;
        for (var i = digits.length - 1; i >= 0; i--) {
            final var sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
            if (carry == 0) {
                break;
            }
        }
        final int[] result;
        if (carry == 1) {
            result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);
        } else {
            result = digits;
        }

        return result;
    }

    public static void main(String[] args) {
        final var solution = new _0066();
        Arrays.stream(solution.plusOne(new int[]{1,9,9})).forEach(System.out::print);
    }
}
