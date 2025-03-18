// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class _0028 {

    public int strStr(String haystack, String needle) {
        int i = 0;
        int needleLength = needle.length();

        while (i + needleLength <= haystack.length()) {
            int j = 0;
            for (; j < needleLength; j ++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }

            if (j == needle.length()) {
                return i;
            }

            i ++;
        }

        return -1;
    }

    public static void main(String[] args) {
        final var solution = new _0028();
        System.out.println(solution.strStr("hello", "ll"));
        System.out.println(solution.strStr("aaaaa", "bba"));
        System.out.println(solution.strStr("", ""));
        System.out.println(solution.strStr("a", "a"));
        System.out.println(solution.strStr("mississippi", "issip"));

    }

}
