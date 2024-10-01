public class _0027 {
    // https://leetcode.com/problems/remove-element
    public int removeElement(int[] nums, int val) {
        var currentIndex = 0;

        for (var i = 0; i < nums.length; i ++) {
            if (val != nums[i]) {
                nums[currentIndex ++] = nums[i];
            }
        }

        return currentIndex;
    }

    public static void main(String[] args) {
        final var solution = new _0027();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(solution.removeElement(nums, 2));
        for (int num : nums) {
            System.out.print(num);
        }
    }
}
