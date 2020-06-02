package searchtasks;

public class Task001_BinarySearch {
    
    public static void main(String[] args) {
        
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int value = 123;
        findValue(a, value);
    }    
    
    public static void findValue(int[] a, int value) {  
        int left = 0, right = a.length - 1, middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (a[middle] == value) {
                System.out.println("The value is in index " + middle);
            } else if (left == right && a[middle] != value) {
                System.out.println("The value is not found");
            }
            if (a[middle] < value) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
    }
}
    