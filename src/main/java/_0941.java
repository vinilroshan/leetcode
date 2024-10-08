// https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/description
public class _0941 {

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    private int gcdOfArray(int[] arr) {
        var gcd = arr[0];
        for (var i = 1; i < arr.length; i ++) {
            if (arr[i] == 0) {
                continue;
            }
            gcd = gcd(arr[i], gcd);
            if (gcd == 1) {
                return 1;
            }
        }
        return gcd;
    }
    public boolean hasGroupsSizeX(int[] deck) {

        final var counters = new int[10001];
        for (final var card: deck) {
            counters[card] ++;
        }

        return gcdOfArray(counters) != 1;
    }

    public static void main(String[] args) {
        final var solution = new _0941();
        System.out.println(solution.hasGroupsSizeX(new int[]{1, 2, 3, 4, 4, 3, 2, 1}));
        System.out.println(solution.hasGroupsSizeX(new int[]{1, 1, 2, 2, 2, 2, 2}));
        System.out.println(solution.hasGroupsSizeX(new int[]{1}));
    }
}
