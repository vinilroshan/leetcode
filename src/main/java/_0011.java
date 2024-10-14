// https://leetcode.com/problems/container-with-most-water/description
public class _0011 {
    public int maxArea(int[] height) {
        int max = -1;
        int i = 0;
        int j = height.length - 1;

        while (i < j) {
            final var area = Math.min(height[i], height[j]) * (j - i);
            if (max < area) {
                max = area;
            }

            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        final var solution = new _0011();
        System.out.println(solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(solution.maxArea(new int[]{1, 1}));
        System.out.println(solution.maxArea(new int[]{2, 1, 2}));
    }
}
