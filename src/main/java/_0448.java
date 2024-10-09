import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description
public class _0448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        final var result = new ArrayList<Integer>();
        final var trackers = new boolean[nums.length];

        for (int num : nums) {
            trackers[num - 1] = true;
        }

        for (var i = 0; i < nums.length; i++) {
            if (!trackers[i]) {
                result.add(i + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        final var solution = new _0448();
        System.out.println(solution.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}
