import java.util.Arrays;

public class _0088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        var i = m - 1;
        var j = n - 1;
        var currentIndex = m + n - 1;

        while (currentIndex > -1) {
            int large;
            if (i > -1 && j > -1) {
                if (nums1[i] > nums2[j]) {
                    large = nums1[i--];
                } else {
                    large = nums2[j--];
                }
            } else if (i > -1) {
                large = nums1[i--];
            } else {
                large = nums2[j--];
            }
            nums1[currentIndex--] = large;
        }
    }

    public static void main(String[] args) {
        final var solution = new _0088();
        final var nums1 = new int[] {1};
        final var nums2 = new int[] {};

        solution.merge(nums1, 1, nums2, 0);
        Arrays.stream(nums1).forEach(System.out::print);
    }
}
