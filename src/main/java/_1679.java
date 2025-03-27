// https://leetcode.com/problems/max-number-of-k-sum-pairs/description

import java.util.Arrays;

public class _1679 {

    public int maxOperations(int[] nums, int k) {
        int count = 0;
        int i = 0;
        int j = nums.length - 1;

        Arrays.sort(nums);
        
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == k) {
                count ++;
                i ++;
                j --;
            } else if (sum > k) {
                j --;
            } else {
                i ++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        final var solution = new _1679();
        System.out.println(solution.maxOperations(new int[] {3,1,3,4,3}, 6));
    }

}
