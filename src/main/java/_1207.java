// https://leetcode.com/problems/unique-number-of-occurrences/description

import java.util.HashMap;
import java.util.HashSet;

public class _1207 {

    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> occurrenceMap = new HashMap<>();
        for (int num : arr) {
            occurrenceMap.putIfAbsent(num, 0);
            occurrenceMap.computeIfPresent(num, (k, v) ->  ++v);
        }

        HashSet<Integer> occurrenceTracker = new HashSet<>();
        for (int occurrence : occurrenceMap.values()) {
            if(!occurrenceTracker.add(occurrence)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        final var solution = new _1207();
        solution.uniqueOccurrences(new int[] {1,1,1,2,3,4,5});
    }

}
