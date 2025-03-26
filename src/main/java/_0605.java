// https://leetcode.com/problems/can-place-flowers/description
public class _0605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 0) {
            return false;
        }

        int count = 0;
        for (int i = 0; i < flowerbed.length; i ++) {
            if (flowerbed[i] == 0) {
                int prev = i == 0 ? 0 : flowerbed[i -1];
                int next = i == flowerbed.length - 1 ? 0 : flowerbed[i + 1];
                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1;
                    count ++;
                }
            }
        }

        return count >= n;
    }

    public static void main(String[] args) {
        
    }

}
