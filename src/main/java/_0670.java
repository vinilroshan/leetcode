// https://leetcode.com/problems/maximum-swap/description
public class _0670 {
    public int maximumSwap(int num) {
        final var digits = new int[8];
        var n = -1;

        while (num != 0) {
            digits[++n] = num % 10;
            num = num / 10;
        }

        final var tracker = new int[10];
        for (var i = n; i >=0; i--) {
            tracker[digits[i]] = i + 1;
        }

        for (var i = n; i >= 0; i --) {
            var swapIndex = i;
            for (var j = i - 1; j >= 0; j --) {
                if (digits[i] < digits[j] && digits[swapIndex] < digits[j]) {
                    swapIndex = tracker[digits[j]] - 1;
                }
            }

            if (swapIndex != i) {
                final var temp = digits[i];
                digits[i] = digits[swapIndex];
                digits[swapIndex] = temp;
                break;
            }
        }

        var result = 0;

        for (var i = n ; i >= 0; i--) {
            result = result * 10 + digits[i];
        }
        return result;
    }

    public static void main(String[] args) {
        final var solution = new _0670();
        System.out.println(solution.maximumSwap(1993));
        System.out.println(solution.maximumSwap(98368));
        System.out.println(solution.maximumSwap(12345678));
    }
}
