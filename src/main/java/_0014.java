// https://leetcode.com/problems/longest-common-prefix/description
public class _0014 {
    public String longestCommonPrefix(String[] strs) {
        final var sb = new StringBuilder();
        var index = 0;
        outer: for (final var chr: strs[0].toCharArray()) {
            var i = 1;
            for (; i < strs.length && strs[i].length() > index; i ++) {
                if (chr != strs[i].charAt(index)) {
                    break outer;
                }
            }
            if (i == strs.length) {
                sb.append(chr);
                index ++;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        final var solution = new _0014();
        System.out.println(solution.longestCommonPrefix(new String[] {"reflower","flow","flight"}));
        System.out.println(solution.longestCommonPrefix(new String[] {"dog","racecar","car"}));
        System.out.println(solution.longestCommonPrefix(new String[] {"ab", "a"}));
    }
}
