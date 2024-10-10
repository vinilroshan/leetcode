// https://leetcode.com/problems/string-to-integer-atoi/description/
public class _0008 {
    private boolean isNumeric(char chr) {
        return chr >= '0' && chr <= '9';
    }

    public int myAtoi(String s) {
        s = s.trim();
        if (s.isBlank()) {
            return 0;
        }

        boolean isNegative = false;
        final var chars = s.toCharArray();
        var index = 0;
        if (chars[0] == '-') {
            isNegative = true;
            index++;
        } else if (chars[0] == '+') {
            index++;
        } else if (!isNumeric(chars[0])) {
            return 0;
        }

        for (; index < chars.length; index++) {
            if (chars[index] != '0') {
                break;
            }
        }

        long longResult = 0;
        for (; index < chars.length; index++) {
            if (isNumeric(chars[index])) {
                final var temp = longResult * 10 + chars[index] - '0';
                if (isNegative && ((temp * -1) <= Integer.MIN_VALUE)) {
                    longResult = Integer.MIN_VALUE;
                    break;
                } else if (temp >= Integer.MAX_VALUE) {
                    longResult = Integer.MAX_VALUE;
                    break;
                }
                longResult = temp;
            } else {
                break;
            }
        }

        return (int) ((isNegative) ? longResult * -1: longResult);
    }

    public static void main(String[] args) {
        final var solution = new _0008();
        System.out.println(solution.myAtoi("-042"));
        System.out.println(solution.myAtoi("1337c0d3"));
        System.out.println(solution.myAtoi("42"));
        System.out.println(solution.myAtoi("0-1"));
        System.out.println(solution.myAtoi("words and 987"));
        System.out.println(solution.myAtoi("+" + Long.MAX_VALUE));
        System.out.println(solution.myAtoi("-" + Long.MAX_VALUE));
        System.out.println(solution.myAtoi("9223372036854775808"));
    }
}