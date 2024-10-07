import java.util.Arrays;

// https://leetcode.com/problems/shuffle-the-array/description/
public class _1470 {
    public int[] shuffle(int[] nums, int n) {
        final var result = new int[2 * n];
        var index = 0;
        for (var i = 0; i < 2 * n; i = i + 2) {
            result[i] = nums[index];
            result[i + 1] = nums[index + n];
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        final var solution = new _1470();
        Arrays
                .stream(solution.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3))
                .forEach(System.out::print);
        Arrays
                .stream(solution.shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4))
                .forEach(System.out::print);
    }
}
