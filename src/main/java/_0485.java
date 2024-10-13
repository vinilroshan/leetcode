// https://leetcode.com/problems/max-consecutive-ones/description
public class _0485 {

    public int findMaxConsecutiveOnes(int[] nums) {
        var result = 0;
        var count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                result = Math.max(result, count);
                count = 0;
            }
        }
        result = Math.max(result, count);
        return result;
    }

    public static void main(String[] args) {
        final var solution = new _0485();
        System.out.println(solution.findMaxConsecutiveOnes(new int[] {0}));
        System.out.println(solution.findMaxConsecutiveOnes(new int[] {0,0}));
        System.out.println(solution.findMaxConsecutiveOnes(new int[] {0,1}));
        System.out.println(solution.findMaxConsecutiveOnes(new int[] {0,1,0}));
        System.out.println(solution.findMaxConsecutiveOnes(new int[] {0,1,1,1,0}));
    }
}
