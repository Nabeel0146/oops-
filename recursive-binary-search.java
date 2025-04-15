import java.util.Scanner;
import java.util.Arrays;

class Recursive {
    int recursiveSearch(int arr[], int l, int h, int item) {
        if (l <= h) {
            int m = (l + h) / 2;
            if (arr[m] == item) {
                return m;
            } else if (arr[m] < item) {
                return recursiveSearch(arr, m + 1, h, item);
            } else {
                return recursiveSearch(arr, l, m - 1, item);
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Recursive binSearch = new Recursive();
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter the number to be searched: ");
        int item = sc.nextInt();
        int result = binSearch.recursiveSearch(arr, 0, n - 1, item);
        if (result == -1) {
            System.out.println("Item not found");
        } else {
            System.out.println("Item found at position " + (result + 1));
        }
    }
}
