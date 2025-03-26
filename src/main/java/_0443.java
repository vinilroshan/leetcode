// https://leetcode.com/problems/string-compression/description
public class _0443 {

    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char currentChar = chars[0];

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == currentChar) {
                count++;
            } else {
                sb.append(currentChar);
                if (count > 1) {
                    sb.append(count);
                }
                currentChar = chars[i];
                count = 1;
            }
        }
        sb.append(currentChar);
        if (count > 1) {
            sb.append(count);
        }

        System.arraycopy(sb.toString().toCharArray(), 0, chars, 0, sb.length());
        return sb.length();
    }

    public static void main(String[] args) {
        final var solution = new _0443();
        final char[] chars1 = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        System.out.println(solution.compress(chars1));
        final char[] chars2 = { 'a' };
        System.out.println(solution.compress(chars2));
    }

}
