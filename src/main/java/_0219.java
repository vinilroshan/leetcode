import java.util.HashMap;

// https://leetcode.com/problems/contains-duplicate-ii/description
public class _0219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        final var indexMap = new HashMap<Integer, Integer>();
        var result = false;
        for (var i = 0; i < nums.length; i++) {
            if (indexMap.get(nums[i]) != null && Math.abs(i - indexMap.get(nums[i])) <= k) {
                result = true;
                break;
            }

            indexMap.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        final var solution = new _0219();
        System.out.println(solution.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
    }
}
