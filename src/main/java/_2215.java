// https://leetcode.com/problems/find-the-difference-of-two-arrays/description

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _2215 {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> nums2Set = new HashSet<>();

        for (int i = 0; i < nums1.length; i ++) {
            nums1Set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i ++) {
            nums2Set.add(nums2[i]);
        }

        List<Integer> nums1Minus = new ArrayList<>();
        List<Integer> nums2Minus = new ArrayList<>();

        for (int x : nums1Set) {
            if (!nums2Set.contains(x)) {
                nums1Minus.add(x);
            }
        }

        for (int x : nums2Set) {
            if (!nums1Set.contains(x)) {
                nums2Minus.add(x);
            }
        }
        
        return List.of(nums1Minus, nums2Minus);
    }

    public static void main(String[] args) {
        final var solution = new _2215();
        System.out.println(solution.findDifference(new int[] {1,2,3,3}, new int[] {1,1,2,2}));
    }

}
