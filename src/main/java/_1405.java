import java.util.PriorityQueue;

// https://leetcode.com/problems/longest-happy-string/description
public class _1405 {
    public String longestDiverseString(int a, int b, int c) {
        final var pq = new PriorityQueue<int[]>((x, y) -> y[0] - x[0]);
        if (a > 0) {
            pq.add(new int[]{a, 'a'});
        }
        if (b > 0) {
            pq.add(new int[]{b, 'b'});
        }
        if (c > 0) {
            pq.add(new int[]{c, 'c'});
        }

        final var sb = new StringBuilder();

        while (!pq.isEmpty()) {
            final var first = pq.poll();
            final var sbLength = sb.length();

            if (sbLength >= 2 && sb.charAt(sbLength - 1) == first[1] && sb.charAt(sbLength - 2) == first[1]) {
                if (pq.isEmpty()) {
                    break;
                }
                final var second = pq.poll();
                sb.append((char) second[1]);
                second[0]--;

                if (second[0] > 0) {
                    pq.offer(second);
                }
                pq.offer(first);
            } else {
                sb.append((char) first[1]);
                first[0]--;
                if (first[0] > 0) {
                    pq.offer(first);
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        final var solution = new _1405();
        System.out.println(solution.longestDiverseString(1,1,7));
    }
}
