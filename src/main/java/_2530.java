import java.util.PriorityQueue;

// https://leetcode.com/problems/maximal-score-after-applying-k-operations/description
public class _2530 {
    public long maxKelements(int[] nums, int k) {
        var result = 0L;
        final var pq = new PriorityQueue<Integer>((a, b) -> b - a);

        for (final var num: nums) {
            pq.offer(num);
        }

        while (!pq.isEmpty() && k > 0) {
            result += pq.peek();
            pq.add((int) Math.ceil(pq.poll() / 3.0));
            k --;
        }

        return result;
    }

    public static void main(String[] args) {
        _2530 solution = new _2530();
        System.out.println(solution.maxKelements(new int[]{10, 10, 10, 10, 10}, 7));
    }
}
