// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            max = Math.max(candy, max);
        }

        ArrayList<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        // slower than the above solution
        int finalMax = max;
        Arrays
                .stream(candies)
                .mapToObj(candy -> candy + extraCandies >= finalMax)
                .collect(Collectors.toList());

        return result;
    }

    public static void main(String[] args) {

    }

}
