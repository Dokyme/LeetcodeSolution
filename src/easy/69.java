class Solution {
    public int mySqrt(int x) {
        int left = 1, right = x;
        int middle = 0;
        while (left <= right) {
            middle = left + (right - left) / 2;
            if (middle > x / middle) {
                right = middle - 1;
            } else if (middle < x / middle) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return right;
    }
}