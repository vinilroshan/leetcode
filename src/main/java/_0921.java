// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description
public class _0921 {
    public int minAddToMakeValid(String s) {
        var openCount = 0;
        var count = 0;

        for (final var chr: s.toCharArray()) {
            if (chr == '(') {
                openCount ++;
            } else {
                if (openCount == 0) {
                    count ++;
                } else {
                    openCount --;
                }
            }
        }

        return count + openCount;
    }

    public static void main(String[] args) {
        final var solution = new _0921();
        System.out.println(solution.minAddToMakeValid("())"));
        System.out.println(solution.minAddToMakeValid("(()()"));
    }
}
