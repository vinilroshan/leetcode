// https://leetcode.com/problems/separate-black-and-white-balls/description
public class _2938 {
    public long minimumSteps(String s) {
        var swap = 0L;
        var blackBallCount = 0L;

        for(final var chr: s.toCharArray()) {
            if (chr == '0') {
                swap += blackBallCount;
            } else {
                blackBallCount ++;
            }
        }

        return swap;
    }

    public static void main(String[] args) {
        final var solution = new _2938();
        System.out.println(solution.minimumSteps("0111"));
        System.out.println(solution.minimumSteps("100"));
        System.out.println(solution.minimumSteps("101"));
        System.out.println(solution.minimumSteps("011100"));
    }
}
