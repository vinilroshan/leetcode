// https://leetcode.com/problems/reverse-vowels-of-a-string/description

public class _0345 {

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public String reverseVowels(String s) {
        char[] chrs = s.toCharArray();
        int i = 0, j = chrs.length - 1;
        while (i < j) {
            if (!isVowel(chrs[i])) {
                i++;
                continue;
            }

            if (!isVowel(chrs[j])) {
                j--;
                continue;
            }

            char temp = chrs[i];
            chrs[i] = chrs[j];
            chrs[j] = temp;

            i++;
            j--;
        }

        return new String(chrs);
    }

    public static void main(String[] args) {
        final var solution = new _0345();
        System.out.println(solution.reverseVowels("hello")); // "holle"
        System.out.println(solution.reverseVowels("leetcode")); // "leotcede"
        System.out.println(solution.reverseVowels("aA")); // "Aa"
    }
}
