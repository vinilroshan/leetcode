import java.util.Arrays;

public class _0026 {
    public int removeDuplicates(int[] nums) {
        var currentIndex = 0;
        var compareInt = Integer.MIN_VALUE;

        for (var num : nums) {
            if (compareInt != num) {
                compareInt = num;
                nums[currentIndex ++] = num;
            }
        }

        return currentIndex;
    }

    public static void main(String[] args) {
        final var solution = new _0026();
        final var nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        System.out.println(solution.removeDuplicates(nums));
        Arrays.stream(nums).forEach(System.out::print);
    }
}
