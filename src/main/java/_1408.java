import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// https://leetcode.com/problems/string-matching-in-an-array
public class _1408 {
    public List<String> stringMatching(String[] words) {
        final var result = new HashSet<String>();
        final var strLengths = new int[words.length];
        for (var i = 0; i < words.length; i ++) {
            strLengths[i] = words[i].length();
        }
        for (var i = 0; i < words.length - 1; i++) {
            for (var j = i + 1; j < words.length; j++) {
                final String a;
                final String b;
                if (strLengths[i] > strLengths[j]) {
                    a = words[i];
                    b = words[j];
                } else {
                    a = words[j];
                    b = words[i];
                }
                if (a.contains(b)) {
                    result.add(b);
                }
            }
        }

        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        final var solution = new _1408();
        System.out.println(solution.stringMatching(new String[] {"mass","as","hero","superhero"}));
        System.out.println(solution.stringMatching(new String[] {"leetcode","et","code"}));
        System.out.println(solution.stringMatching(new String[] {"blue","green","bu"}));
    }
}
