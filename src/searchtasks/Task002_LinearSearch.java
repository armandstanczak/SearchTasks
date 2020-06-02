package searchtasks;

public class Task002_LinearSearch {

    public static void main(String[] args) {
        
        int[] a = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        int value = 3;
        findValue(a, value, 0);
    }
    
    public static void findValue(int[] a, int value, int left) {
        int right = a.length - 1;
        if (left <= right) {
            if (a[left] == value) {
                System.out.println("The value is in index " + left);
            } else if (left == right && a[left] != value) {
                System.out.println("Value not found");
            } else {
                findValue(a, value, left + 1);
            }
        }
    }
}
