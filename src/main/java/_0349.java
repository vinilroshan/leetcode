import java.util.Arrays;
import java.util.HashSet;

public class _0349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        final var resultSet = new HashSet<Integer>();
        final var num1Set = new HashSet<Integer>();

        for (final var num : nums1) {
            num1Set.add(num);
        }

        for (final var num : nums2) {
            if (num1Set.contains(num)) {
                resultSet.add(num);
            }
        }
        var index = 0;
        final var result = new int[resultSet.size()];
        for (final var num : resultSet) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        final var solution = new _0349();
        Arrays
                .stream(solution.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}))
                .forEach(System.out::print);
    }
}
