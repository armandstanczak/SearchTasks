package searchtasks;

import java.util.Arrays;

public class Task003_JumpSearchSorted {

    public static void main(String[] args) {
        
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int value = 120;
        int index = jumpSearch(a, value);
        if (index > 0) {
            System.out.println("Original array: " + Arrays.toString(a) + "\nThe value you are looking for: " + value + "\nLocated at index: " + index);
        } else {
            System.out.println("Original array: " + Arrays.toString(a) + "\nThe value you are looking for: " + value + "\nNot available in the array");
        }
    }
    
    public static int jumpSearch(int[] a, int value) {
        int blockSize = (int) Math.sqrt(a.length);
        int index = 0;
        
        while(a[Math.min(blockSize, a.length) - 1] < value) {
            index = blockSize;
            blockSize += (int) Math.sqrt(a.length);
            if (index >= a.length) {
                return -1;
            }
        }
        
        while (a[index] < value) {
            index++;
            if (index == Math.min(blockSize, a.length)) {
                return -1;
            }
        }
        
        if (a[index] == value) {
            return index;
        }
        return -1;
    }
}
