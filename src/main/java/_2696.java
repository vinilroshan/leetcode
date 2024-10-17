import java.util.Stack;

// https://leetcode.com/problems/minimum-string-length-after-removing-substrings/description

public class _2696 {
    public int minLength(String s) {
        final var stack = new Stack<Character>();
        var count = 0;

        for (final var chr : s.toCharArray()) {
            if (chr == 'A' || chr == 'C') {
                stack.push(chr);
            } else if (chr == 'B' && !stack.empty() && stack.peek() == 'A') {
                stack.pop();
            } else if (chr == 'D' && !stack.empty() && stack.peek() == 'C') {
                stack.pop();
            } else {
                count = count + 1 + stack.size();
                stack.clear();
            }
        }

        count += stack.size();

        return count;
    }

    public static void main(String[] args) {
        final var solution = new _2696();
        System.out.println(solution.minLength("ACBBD"));
        System.out.println(solution.minLength("ABFCACDB"));

    }
}
