// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description
public class _0744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int[] removedDups = new int[letters.length];
        int j = 0;
        removedDups[j] = letters[0] - 'a';
        for (int i = 1; i < letters.length; i ++) {
            if (removedDups[j] != (letters[i] - 'a')) {
                removedDups[++j] = letters[i] - 'a';
            }
        }

        int start = 0;
        int end = j;
        int intTarget = target - 'a';
        int index = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (removedDups[mid] == intTarget) {
                index = mid;
                break;
            } else if (removedDups[mid] > intTarget) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (index == -1) {
            if (start > j) {
                index = 0;
            } else {
                index = start;
            }
        } else if (index == j) {
            index = 0;
        }else {
            index ++;
        }

        return (char) (removedDups[index] + 'a');
    }

    public static void main(String[] args) {
        final var solution = new _0744();
        System.out.println(solution.nextGreatestLetter("cfg".toCharArray(), 'd'));
        System.out.println(solution.nextGreatestLetter("cfg".toCharArray(), 'c'));
        System.out.println(solution.nextGreatestLetter("xxyyyyyy".toCharArray(), 'z'));
    }
}
