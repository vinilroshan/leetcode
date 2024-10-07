public class _0268 {
    public int missingNumber(int[] nums) {
        final var indicators = new boolean[nums.length + 1];

        for (final var num: nums) {
            indicators[num] = true;
        }
        var i = 0;
        for (; i < indicators.length; i ++) {
            if (!indicators[i]) {
                break;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        final var solution = new _0268();
        System.out.println(solution.missingNumber(new int[] {3,0,1}));
    }
}
