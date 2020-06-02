package searchtasks;

import java.util.Arrays;

public class Task004_InterpolationSearch {

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 21, 34, 45, 91, 120, 130, 456, 564};
        int value = 91;
        int index = interpolationSearch(a, value);
        if (index < 0) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number " + value + " found at index " + index + " in array: " + Arrays.toString(a));
        }
    }
    
    public static int interpolationSearch(int[] a, int value) {
        int start = 0, end = a.length - 1, mid;

        while (a[end] != a[start] && a[start] < value && a[end] >= value) {
            mid = start + ((value - a[start]) * (end - start) / (a[end] - a[start]));
            if (value > a[mid]) {
                start = mid + 1;
            } else if (value < a[mid]) {
                end = mid + 1;
            } else {
                return mid;
            }
        }
        if (a[start] == value) {
            return start;
        } else {
            return -1;
        }
    }
}
