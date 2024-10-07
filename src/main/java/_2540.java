// https://leetcode.com/problems/minimum-common-value/description
public class _2540 {

    public int getCommon(int[] nums1, int[] nums2) {
        var i = 0;
        var j = 0;
        var smallestCommon = -1;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                smallestCommon = nums1[i];
                break;
            } else if (nums1[i] < nums2[j]) {
                i ++;
            } else {
                j ++;
            }
        }

        return smallestCommon;
    }

    public static void main(String[] args) {
        final var solution = new _2540();
        System.out.println(solution.getCommon(new int[] {1,2,3}, new int[] {2, 4}));
        System.out.println(solution.getCommon(new int[] {1,2,3,6}, new int[] {2,3,4,5}));
        System.out.println(solution.getCommon(new int[] {1,2,3}, new int[] {2, 4}));
        System.out.println(solution.getCommon(new int[] {1,2,3}, new int[] {2, 4}));
    }
}
