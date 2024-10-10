// https://leetcode.com/problems/integer-to-roman/description/
public class _0012 {
    private static final String[] UNITS = new String[] {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private static final String[] TENS = new String[] {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] HUNDREDS = new String[] {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static final String[] THOUSANDS = new String[] {"", "M", "MM", "MMM"};

    public String intToRoman(int num) {
        return THOUSANDS[num/1000] + HUNDREDS[(num/100) % 10] + TENS[(num/10) % 10] + UNITS[num % 10];
    }

    public static void main(String[] args) {
        final var solution = new _0012();
        System.out.println(solution.intToRoman(3999));
        System.out.println(solution.intToRoman(3749));
    }
}
