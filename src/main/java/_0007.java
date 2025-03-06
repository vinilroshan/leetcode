// https://leetcode.com/problems/reverse-integer
public class _0007 {

    public int reverse(int x) {
        long rev = 0;
        boolean isNeg = x < 0;
        x = Math.abs(x);

        while (x > 0) {
            int y = x % 10;
            rev = rev * 10 + y;
            x = x / 10;
        }

        if (isNeg) {
            rev = rev * -1;
        }

        return (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) ? 0 : (int) rev;
    }

    public static void main(String[] args) {
        final var solution = new _0007();
        System.out.println(solution.reverse(123));
        System.out.println(solution.reverse(-123));
        System.out.println(solution.reverse(120));
    }
}
