// https://leetcode.com/problems/maximum-average-subarray-i/description
public class _0643 {

    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        int i = 0;
        for (; i < k; i ++) {
            sum += nums[i];
        }
        double maxMean = sum / k;
        for (; i < nums.length; i ++ ) {
            sum = sum - nums[i - k] + nums[i];
            maxMean = Math.max(maxMean, sum / k);
        }

        return maxMean;
    }

    public static void main(String[] args) {
        final var solution = new _0643();
        System.out.println(solution.findMaxAverage(new int[] {1,2,3,4,5,6,7,8,9}, 5));
        System.out.println(solution.findMaxAverage(new int[] {-1}, 1));
    }

}
