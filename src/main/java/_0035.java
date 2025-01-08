// https://leetcode.com/problems/search-insert-position
public class _0035 {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                result = mid;
                break;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (result == -1) {
            result = start;
        }
        return result;
    }

    public static void main(String[] args) {
        final var solution = new _0035();
        System.out.println(solution.searchInsert(new int[] {1,3,5,6}, 5));
        System.out.println(solution.searchInsert(new int[] {1,3,5}, 3));
        System.out.println(solution.searchInsert(new int[] {1,3,5,6}, 2));
        System.out.println(solution.searchInsert(new int[] {1,3,5,6}, 7));
    }
}
