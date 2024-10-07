import java.util.HashSet;

// https://leetcode.com/problems/single-number/description
public class _0136 {
    public int singleNumber(int[] nums) {
        final var set = new HashSet<Integer>();
        for (final var num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }
        return (int) set.toArray()[0];
    }

    public int singleNumber2(int[] nums) {
        var result = 0;
        for (final var num: nums) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {
        final var solution = new _0136();
        System.out.println(solution.singleNumber(new int[] {4,1,2,1,2}));
        System.out.println(solution.singleNumber2(new int[] {4,1,2,1,2}));
    }
}
