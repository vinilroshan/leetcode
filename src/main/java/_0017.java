import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class _0017 {

    public List<String> letterCombinations(String digits) {
        final var CACHE = new char[][] {
                {},
                {},
                "abc".toCharArray(),
                "def".toCharArray(),
                "ghi".toCharArray(),
                "jkl".toCharArray(),
                "mno".toCharArray(),
                "pqrs".toCharArray(),
                "tuv".toCharArray(),
                "wxyz".toCharArray()
        };
        var result = new ArrayList<String>();
        final var n = digits.length();

        if (n > 0) {
            for (final var chr : CACHE[digits.charAt(0) - '0']) {
                result.add(String.valueOf(chr));
            }

            for (var i = 1; i < n; i++) {
                final var chars = CACHE[digits.charAt(i) - '0'];

                final var temp = new ArrayList<String>();
                for (final var chr : chars) {
                    for (final var combo : result) {
                        temp.add(combo + chr);
                    }
                }
                result = temp;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        final var solution = new _0017();
        System.out.println(solution.letterCombinations("2345"));
    }
}
