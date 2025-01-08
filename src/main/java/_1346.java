import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/check-if-n-and-its-double-exist
public class _1346 {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> tracker = new HashSet<>();

        boolean found = false;
        for (int num : arr) {
            if (tracker.contains(num * 2) || (num % 2 == 0 && tracker.contains(num / 2))) {
                found = true;
                break;
            } else {
                tracker.add(num);
            }
        }
        return found;
    }
}
