import java.util.Arrays;

// https://leetcode.com/problems/maximum-units-on-a-truck/description/
public class _1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (boxType1, boxType2) -> Integer.compare(boxType2[1], boxType1[1]));

        var boxes = 0;
        var units = 0;

        for (int[] boxType : boxTypes) {
            if (boxes == truckSize) {
                break;
            }
            final int selectedBoxes;
            if (boxes + boxType[0] > truckSize) {
                selectedBoxes = truckSize - boxes;
                boxes = truckSize;
            } else {
                selectedBoxes = boxType[0];
                boxes += selectedBoxes;
            }
            units += selectedBoxes * boxType[1];
        }

        return units;
    }

    public static void main(String[] args) {
        final var solution = new _1710();
        System.out.println(solution.maximumUnits(new int[][] {{5,10},{2,5},{4,7},{3,9}}, 10));
    }
}
