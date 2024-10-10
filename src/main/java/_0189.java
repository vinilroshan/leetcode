// https://leetcode.com/problems/rotate-array/description
public class _0189 {
    public void rotate(int[] nums, int k) {
        final var length = nums.length;
        var result = new int[length];
        k = k % length;

        System.arraycopy(nums, length - k, result, 0, k);
        System.arraycopy(nums, 0, result, k, length - k);
        System.arraycopy(result, 0, nums, 0, length);
    }

    public static void main(String[] args) {
        final var solution = new _0189();
        solution.rotate(new int[] {1,2,3,4,5,6,7}, 11);
    }
}
