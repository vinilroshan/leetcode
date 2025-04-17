// https://leetcode.com/problems/equal-row-and-column-pairs/description

public class _2352 {

    // [3,2,1]
    // [1,7,6]
    // [2,7,7]
    public int equalPairs(int[][] grid) {
        int count = 0;
        int n = grid.length;

        for (int i = 0; i< n; i ++) {

            for (int j = 0; j < n; j ++) {
                boolean isEqual = true;
                for (int k = 0; k < n; k ++) {
                    if (grid[i][k] != grid[k][j]) {
                        isEqual = false;
                        break;
                    } 
                }
                if (isEqual) {
                    count ++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] input = new int[][] {{3,2,1},{1,7,6},{2,7,7}};
        final var solution = new _2352();
        System.out.println(solution.equalPairs(input));
        
        input = new int[][] {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        System.out.println(solution.equalPairs(input));
    }

}
