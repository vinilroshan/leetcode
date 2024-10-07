import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class _0350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        final var num1CountMap = new HashMap<Integer, Integer>();
        final var num2CountMap = new HashMap<Integer, Integer>();
        final var resultMap = new HashMap<Integer, Integer>();

        for (final var num : nums1) {
            num1CountMap.putIfAbsent(num, 0);
            num1CountMap.put(num, num1CountMap.get(num) + 1);
        }

        for (final var num : nums2) {
            num2CountMap.putIfAbsent(num, 0);
            num2CountMap.put(num, num2CountMap.get(num) + 1);
        }

        int count = 0;
        for (final var num : nums2) {
            if (!resultMap.containsKey(num) && num1CountMap.containsKey(num)) {
                final var times = Math.min(num1CountMap.get(num), num2CountMap.get(num));
                resultMap.put(num, times);
                count += times;
            }
        }

        final var result = new int[count];
        var index = 0;
        for (final var entry : resultMap.entrySet()) {
            for (var i = 0; i < entry.getValue(); i++) {
                result[index++] = entry.getKey();
            }
        }

        return result;
    }

    public int[] intersect2(int[] nums1, int[] nums2) {
        final var num1CountMap = new HashMap<Integer, Integer>();
        for (final var num : nums1) {
            num1CountMap.putIfAbsent(num, 0);
            num1CountMap.put(num, num1CountMap.get(num) + 1);
        }

        final var resultList = new ArrayList<Integer>();
        for (final var num : nums2) {
            if (num1CountMap.containsKey(num)) {
                resultList.add(num);
                final var count = num1CountMap.get(num) - 1;
                if (count == 0) {
                    num1CountMap.remove(num);
                } else {
                    num1CountMap.put(num, count);
                }
            }
        }

        var index = 0;
        final var result = new int[resultList.size()];
        for (final var num : resultList) {
            result[index++] = num;
        }
        return result;
    }

    public int[] intersect3(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        final var resultList = new ArrayList<Integer>();
        var i = 0;
        var j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                resultList.add(nums1[i]);
                i ++;
                j ++;
            } else if (nums1[i] < nums2[j]) {
                i ++;
            } else {
                j ++;
            }
        }

        var index = 0;
        final var result = new int[resultList.size()];
        for (final var num : resultList) {
            result[index++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        final var solution = new _0350();
        Arrays
                .stream(solution.intersect3(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}))
                .forEach(System.out::print);
        Arrays
                .stream(solution.intersect3(new int[]{1, 2, 2, 1}, new int[]{2, 2}))
                .forEach(System.out::print);
    }
}
