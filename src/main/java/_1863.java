// https://leetcode.com/problems/sum-of-all-subset-xor-totals/description
public class _1863 {
    public int subsetXORSum(int[] nums) {
        var result = 0;
        for (var i = 1 ; i < 1 << nums.length; i ++) { // 0
            var xor = 0;
            for (var j = 0; j < nums.length; j ++) { // 0
                if ((i & (1 << j)) != 0) {
                    xor = xor ^ nums[j];
                }
            }
            result += xor;
        }
        return result;
    }

    public static void main(String[] args) {
        final var solution = new _1863();
        System.out.println(solution.subsetXORSum(new int[] {3,4,5,6,7,8}));
    }
}
