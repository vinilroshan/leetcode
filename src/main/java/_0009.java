// https://leetcode.com/problems/palindrome-number/description/
public class _0009 {
    public boolean isPalindrome(int x) {
        var temp = x;
        var reverse = 0;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }

        return x == reverse;
    }

    public static void main(String[] args) {
        final var solution = new _0009();
        System.out.println(solution.isPalindrome(121));
        System.out.println(solution.isPalindrome(-121));
        System.out.println(solution.isPalindrome(123));
    }
}
