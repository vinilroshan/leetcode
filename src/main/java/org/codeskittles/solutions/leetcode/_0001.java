package org.codeskittles.solutions.leetcode;

import java.util.HashMap;

// https://leetcode.com/problems/two-sum/description/
public class _0001 {
    public int[] twoSum(int[] nums, int target) {
        final var indexMap = new HashMap<Integer, Integer>();
        final var answer = new int[2];
        for (var index = 0; index < nums.length; index ++) {
            final var second = target - nums[index];
            if (indexMap.containsKey(second)) {
                answer[0] = index;
                answer[1] = indexMap.get(second);
                break;
            }
            indexMap.put(nums[index], index);
        }

        return answer;
    }

    public static void main(String[] args) {
        final var solution = new _0001();
        final var answer = solution.twoSum(new int[]{3,3}, 6);
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}
