// https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three
public class _1780 {

    public boolean checkPowersOfThree(int n) {
        int[] powersOf3 = new int[15];
        powersOf3[0] = 1;
        for (int i = 1; i < 15; i ++) {
            powersOf3[i] = powersOf3[i - 1] * 3;
        }

        for (int i = 14; i >= 0; i --) {
            if (n >= powersOf3[i]) {
                n -= powersOf3[i];
            }
        }

        return n == 0;
    }

    public static void main(String[] args) {
        final var solution = new _1780();
        System.out.println(solution.checkPowersOfThree(12));
        System.out.println(solution.checkPowersOfThree(91));
        System.out.println(solution.checkPowersOfThree(21));
    }

}
