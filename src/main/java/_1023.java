import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/camelcase-matching/description
public class _1023 {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        final var result = new ArrayList<Boolean>(queries.length);
        final var patternChars = pattern.toCharArray();

        for (final var query: queries) {
            var patternIndex = 0;
            var queryResult = true;

            for (final var chr: query.toCharArray()) {
                if (patternIndex == pattern.length()) {
                    if (chr >= 'A' && chr <= 'Z') {
                        queryResult = false;
                        break;
                    }
                    continue;
                }
                if (patternChars[patternIndex] == chr) {
                    patternIndex ++;
                } else if (chr >= 'A' && chr <= 'Z') {
                    queryResult = false;
                    break;
                }
            }

            if (patternIndex < pattern.length()) {
                queryResult = false;
            }

            result.add(queryResult);
        }

        return result;
    }

    public static void main(String[] args) {
        final var solution = new _1023();
        System.out.println(solution.camelMatch(new String[] {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"}, "FB"));
        System.out.println(solution.camelMatch(new String[] {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"}, "FoBa"));
    }
}
