import java.util.HashSet;

// https://leetcode.com/problems/find-subarrays-with-equal-sum/description/
public class _2395 {
    public boolean findSubarrays(int[] nums) {
        var result = false;
        final var sumTracker = new HashSet<Integer>();
        for (var i = 0; i < nums.length - 1; i ++) {
            if (!sumTracker.add(nums[i] + nums[i+1])) {
                result = true;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        final var solution = new _2395();
        System.out.println(solution.findSubarrays(new int[] {4,2,4}));
        System.out.println(solution.findSubarrays(new int[] {1,2,3,4,5}));
    }
}
