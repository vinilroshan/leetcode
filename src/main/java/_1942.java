import java.util.Arrays;
import java.util.Comparator;

// https://leetcode.com/problems/the-number-of-the-smallest-unoccupied-chair
public class _1942 {
    public int smallestChair(int[][] times, int targetFriend) {
        final var n = times.length;
        final var arrTimes = new int[n][2];
        final var depTimes = new int[n][2];

        for (var i = 0; i < n; i++) {
            arrTimes[i] = new int[]{i + 1, times[i][0]};
            depTimes[i] = new int[]{i + 1, times[i][1]};
        }

        Arrays.sort(arrTimes, Comparator.comparingInt(arrTime -> arrTime[1]));
        Arrays.sort(depTimes, Comparator.comparingInt(depTime -> depTime[1]));

        var indexI = 0;
        var indexJ = 0;
        var seatIndex = 0;
        final var seats = new int[n];

        var result = -1;
        while (indexI < n) {
            if (arrTimes[indexI][1] < depTimes[indexJ][1]) {
                for (var i = seatIndex; i < n; i++) {
                    if (seats[i] == 0) {
                        seats[i] = arrTimes[indexI][0];
                        if (arrTimes[indexI][0] == targetFriend + 1) {
                            result = i;
                        }
                        seatIndex ++;
                        break;
                    }
                }
                indexI++;
            } else if (arrTimes[indexI][1] > depTimes[indexJ][1]) {
                for (var i = 0; i < n; i++) {
                    if (seats[i] == depTimes[indexJ][0]) {
                        seats[i] = 0;
                        seatIndex = Math.min(seatIndex, i);
                        break;
                    }
                }
                indexJ++;
            } else {
                while (depTimes[indexJ][1] == arrTimes[indexI][1]) {
                    for (var i = 0; i < n; i++) {
                        if (seats[i] == depTimes[indexJ][0]) {
                            seats[i] = 0;
                            seatIndex = Math.min(seatIndex, i);
                            break;
                        }
                    }
                    indexJ ++;
                }
                for (var i = seatIndex; i < n ; i ++) {
                    if (seats[i] == 0) {
                        seats[i] = arrTimes[indexI][0];
                        seatIndex ++;
                        if (arrTimes[indexI][0] == targetFriend + 1) {
                            result = i;
                        }
                        break;
                    }
                }
                indexI++;
            }

            if (result != -1) {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        final var solution = new _1942();
        System.out.println(solution.smallestChair(new int[][]{{4,5},{6,8},{8,10},{1,8}}, 2));
        ;
    }
}
