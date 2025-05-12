import java.util.Scanner;

public class BubbleSort {

    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int n = array.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements to sort: ");
        int n = sc.nextInt();
        sc.nextLine();

        Integer[] array = new Integer[n];
        System.out.println("Enter " + n + " integers to sort:");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("\nBefore sorting:");
        printArray(array);

        bubbleSort(array);

        System.out.println("After sorting:");
        printArray(array);

        sc.close();
    }
}
