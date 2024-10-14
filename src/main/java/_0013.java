import java.util.HashMap;

// https://leetcode.com/problems/roman-to-integer/description/
public class _0013 {
    public int romanToInt(String s) {
        final var map = new HashMap<String, Integer>() {{
            put("I", 1);
            put("IV", 4);
            put("V", 5);
            put("IX", 9);
            put("X", 10);
            put("XL", 40);
            put("L", 50);
            put("XC", 90);
            put("C", 100);
            put("CD", 400);
            put("D", 500);
            put("CM", 900);
            put("M", 1000);
        }};
        var result = 0;
        final var chars = s.toCharArray();
        var i = 0;
        for (; i < chars.length - 1; i++) {
            final var val = map.getOrDefault(String.valueOf(new char[]{chars[i], chars[i + 1]}), 0);
            if (val == 0) {
                result += map.get(String.valueOf(chars[i]));
            } else {
                result += val;
                i++;
            }
        }

        if (i < chars.length) {
            result += map.get(String.valueOf(chars[i]));
        }

        return result;
    }

    public int romanToInt2(String s) {
        var result = 0;
        for (var i = s.length() - 1; i >= 0; i --) {
            var num = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };

            if (num * 4 < result) {
                result -= num;
            } else {
                result += num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        final var solution = new _0013();
        System.out.println(solution.romanToInt2("IX"));
        System.out.println(solution.romanToInt2("MMCMXCIV"));
        System.out.println(solution.romanToInt2("MIX"));
        System.out.println(solution.romanToInt("MIX"));
    }
}
