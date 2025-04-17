// https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description
public class _1493 {

    public int longestSubarray(int[] nums) {
        int i = -1;
        int maxCount = Integer.MIN_VALUE;
        int currCount = 0;
        
        for (int num : nums) {
            if (num == 0) {

            } else {
                currCount ++;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        
    }

}
