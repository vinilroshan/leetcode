// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii
public class _0080 {

    public int removeDuplicates(int[] nums) {
        var index = 0;
        var currentTracker = -10001;
        var trackerCount = 0;
        for (final var num : nums) {
            if (currentTracker != num) {
                currentTracker = num;
                trackerCount = 1;
                nums[index++] = num;
            } else if (trackerCount < 2) {
                trackerCount ++;
                nums[index++] = num;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        final var solution = new _0080();
        System.out.println(solution.removeDuplicates(new int[] {0,0,1,1,1,1,2,3,3}));
    }
}
