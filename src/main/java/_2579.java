// https://leetcode.com/problems/count-total-number-of-colored-cells
public class _2579 {
    
    public long coloredCells(int n) {
        long t = n;
        return t * t + (t-1) * (t-1);
    }

    public static void main(String[] args) {
        final var solution = new _2579();
        System.out.println(solution.coloredCells(10)); 
    }
}
