import java.util.HashMap;

public class _0169 {
    public int majorityElement(int[] nums) {
        final var counterMap = new HashMap<Integer, Integer>();

        for (var num : nums) {
            Integer count;
            if ((count = counterMap.get(num)) == null) {
                count = 0;
            }

            counterMap.put(num, ++count);
        }

        int result = 0;
        final var majorityCount = nums.length % 2 == 0? nums.length/2 : nums.length/2 + 1;
        for (final var entry : counterMap.entrySet()) {
            if (entry.getValue() >= majorityCount) {
                result = entry.getKey();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        final var solution = new _0169();
        System.out.println(solution.majorityElement(new int[] {3,3,9}));
    }
}
