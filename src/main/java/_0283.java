import java.util.Arrays;

public class _0283 {
    public void moveZeroes(int[] nums) {
        var index = 0;
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        for (; index < nums.length; index++) {
            nums[index] = 0;
        }
    }

    public static void main(String[] args) {
        final var solution = new _0283();
        final var nums = new int[] {1,0,1,0, 1};
        solution.moveZeroes(nums);
        Arrays.stream(nums).forEach(System.out::print);
    }
}
