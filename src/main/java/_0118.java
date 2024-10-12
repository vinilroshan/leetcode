import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle/description
public class _0118 {
    public List<List<Integer>> generate(int numRows) {
        final var result = new ArrayList<List<Integer>>();
        result.add(List.of(1));

        for (var i = 2; i <= numRows; i ++) {
            final var row = new ArrayList<Integer>();
            row.add(1);

            final var previousRow = result.getLast();
            for(var j = 0; j < previousRow.size() - 1; j ++) {
                row.add(previousRow.get(j) + previousRow.get(j + 1));
            }
            row.add(1);
            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        final var solution = new _0118();
        System.out.println(solution.generate(1));
        System.out.println(solution.generate(2));
        System.out.println(solution.generate(3));
        System.out.println(solution.generate(4));
        System.out.println(solution.generate(5));
        System.out.println(solution.generate(11));
    }
}
