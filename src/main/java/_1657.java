// https://leetcode.com/problems/determine-if-two-strings-are-close/description

import java.util.Arrays;

public class _1657 {

    public boolean closeStrings(String word1, String word2) {
        int[] char1Freq = new int[26];
        int[] char2Freq = new int[26];

        for (char c : word1.toCharArray()) {
            char1Freq[c - 'a'] ++;
        }

        for (char c : word2.toCharArray()) {
            char2Freq[c - 'a'] ++;
        }

        for (int i = 0; i < 26; i ++) {
            if (char1Freq[i] != 0 ^ char2Freq[i] != 0) {
                return false;
            }
        }

        Arrays.sort(char1Freq);
        Arrays.sort(char2Freq);

        for (int i = 0; i < 26; i ++) {
            if (char1Freq[i] != char2Freq[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        
    }

}
