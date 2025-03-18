// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.LinkedHashSet;

public class _0003 {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        for (char chr : s.toCharArray()) {
            if (!set.add(chr)) {
                longest = Math.max(longest, set.size());
                while (set.getFirst() != chr) {
                    set.removeFirst();
                }
                set.removeFirst();
                set.add(chr);
            }
        }
        return longest = Math.max(longest, set.size());
    }

    public static void main(String[] args) {
        final var solution = new _0003();
        System.out.println(solution.lengthOfLongestSubstring("aabaab!bb"));
    }
}
