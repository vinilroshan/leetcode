// https://leetcode.com/problems/reverse-words-in-a-string/description

import java.util.StringJoiner;

public class _0151 {

    public String reverseWords(String s) {
        StringJoiner sj = new StringJoiner(" ");
        String[] words = s.trim().split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            sj.add(words[i]);
        }
        return sj.toString();
    }

    public static void main(String[] args) {
        final var solution = new _0151();
        System.out.println(solution.reverseWords("the sky is blue")); // "blue is sky the"
        System.out.println(solution.reverseWords("  hello world  ")); // "world hello"
        System.out.println(solution.reverseWords("  hello                world  ")); // "world hello"
    }
}
