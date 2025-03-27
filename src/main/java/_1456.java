// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length
public class _1456 {

    private boolean isVowel(char chr) {
        return chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u';
    }

    public int maxVowels(String s, int k) {
        char[] chrs = s.toCharArray();
        int count = 0;

        int i = 0;
        for (; i < k; i++) {
            if (isVowel(chrs[i])) {
                count++;
            }
        }
        int max = Math.max(0, count);
        for (; i < chrs.length; i++) {
            if (isVowel(chrs[i - k])) {
                count--;
            }

            if (isVowel(chrs[i])) {
                count++;
            }

            max = Math.max(max, count);
        }

        return max;

    }

    public static void main(String[] args) {
        final var solution = new _1456();
        System.out.println(solution.maxVowels("abciiidef", 3));
    }

}
