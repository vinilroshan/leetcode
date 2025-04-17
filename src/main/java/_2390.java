// https://leetcode.com/problems/removing-stars-from-a-string/description
public class _2390 {

    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        int index = -1;
        for (char chr : s.toCharArray()) {
            if (chr == '*') {
                if (index != -1) {
                    sb.deleteCharAt(index--);
                }
            } else {
                sb.append(chr);
                index ++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        final var solution = new _2390();
        System.out.println(solution.removeStars("leet**cod*e"));
        System.out.println(solution.removeStars("erase****"));
    }

}
