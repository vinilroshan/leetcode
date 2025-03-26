// https://leetcode.com/problems/product-of-array-except-self/description



public class _0238 {

    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] forwardProd = new int[length];
        int[] backwardProd = new int[length];

        int forwardTemp = 1;
        int backwardTemp = 1;
        for (int i = 0; i < length; i ++) {
            forwardTemp *= nums[i];
            forwardProd[i] = forwardTemp;

            backwardTemp *= nums[length - 1 - i];
            backwardProd[length - 1 - i] = backwardTemp;
        }

        nums[0] = backwardProd[1];
        nums[length - 1] = forwardProd[length - 2];
        for (int i = 1; i < length - 1; i ++) {
            nums[i] = forwardProd[i - 1] * backwardProd[i + 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        final var solution = new _0238();
        for (int i :solution.productExceptSelf(new int[]{1, 2, 3, 4})) {
            System.out.print(i);
        }
        for (int i :solution.productExceptSelf(new int[]{-1, 1, 0, 3, -3})) {
            System.out.print(i);
        }
    }
}
