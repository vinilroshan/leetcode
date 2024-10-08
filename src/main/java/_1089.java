import java.util.Arrays;

// https://leetcode.com/problems/duplicate-zeros
public class _1089 {
    public void duplicateZeros(int[] arr) {
        final var length = arr.length;
        final var result = new int[length];
        var resultIndex = 0;
        var arrIndex = 0;

        while (resultIndex < length) {
            result[resultIndex++] = arr[arrIndex];
            if (arr[arrIndex++] == 0 && resultIndex != length) {
                result[resultIndex++] = 0;
            }
        }

        System.arraycopy(result, 0, arr, 0, length);
    }

    public static void main(String[] args) {
        final var solution = new _1089();
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        solution.duplicateZeros(arr);
        Arrays.stream(arr).forEach(System.out::print);
    }
}
