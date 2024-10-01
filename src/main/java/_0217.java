import java.util.HashSet;

public class _0217 {
    public boolean containsDuplicate(int[] nums) {
        final var set = new HashSet<Integer>();
        boolean result = false;
        for (final var num : nums) {
            if (!set.add(num)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        final var solution = new _0217();
        System.out.println(solution.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
        System.out.println(solution.containsDuplicate(new int[]{1, 2, 3, 4}));
    }
}
