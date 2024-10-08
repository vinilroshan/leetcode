// https://leetcode.com/problems/check-distances-between-same-letters/description/
public class _2399 {
    public boolean checkDistances(String s, int[] distance) {
        final var tracker = new int[26][3];
        final var chars = s.toCharArray();
        for (var i = 0; i < chars.length; i++) {
            final var charTracker = tracker[chars[i] - 'a'];
            if (charTracker[0] == 1) {
                charTracker[2] = i;
            } else {
                charTracker[0] = 1;
                charTracker[1] = i;
            }
        }

        var wellSpaced = true;
        for (var i = 0; i < 26; i++) {
            final var charTracker = tracker[i];
            if (charTracker[0] == 1) {
                final var chrDistance = charTracker[2] - charTracker[1] - 1;
                if (chrDistance != distance[i]) {
                    wellSpaced = false;
                    break;
                }
            }
        }

        return wellSpaced;
    }

    public static void main(String[] args) {
        final var solution = new _2399();
        System.out.println(solution.checkDistances("abaccb", new int[] {1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
        System.out.println(solution.checkDistances("aa", new int[] {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
    }
}

