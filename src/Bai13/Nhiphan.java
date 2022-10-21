package Bai13;

public class Nhiphan {
    static int BinarySreach(int[] a, int x) {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == x) {
                return mid;
            } else if (a[mid] > x) {
                return right = mid - 1;
            } else {
                return left = right + 1;
            }

        }
        return -1;
    }
}
