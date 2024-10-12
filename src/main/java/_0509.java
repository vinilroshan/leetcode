// https://leetcode.com/problems/fibonacci-number/description
public class _0509 {
    public int fib(int n) {
        var a = 0;
        var b = 1;
        if (n == 0) {
            return a;
        } else if (n == 1) {
            return b;
        } else {
            for (var i = 2; i <= n; i ++) {
                var temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }
    }

    public static void main(String[] args) {
        final var solution = new _0509();
        System.out.println(solution.fib(10));
    }
}
