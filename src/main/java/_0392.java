// https://leetcode.com/problems/is-subsequence
public class _0392 {

    public boolean isSubsequence(String s, String t) {
        int i = 0; 
        int j = 0;

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        int sLen = sChars.length;
        int tLen = tChars.length;

        while (i < sLen && j < tLen) {
            if (sChars[i] == tChars[j]) {
                i++;
            }
            j++;
        }

        return i == sLen;
    }

    public static void main(String[] args) {
        
    }
}
