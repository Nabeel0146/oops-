import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DequeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> deque = new LinkedList<>();

        System.out.print("Enter number of elements to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter element " + i + ": ");
            String element = sc.nextLine();

            deque.addLast(element); // Add elements to the rear by default
        }

        System.out.println("\nInitial Deque: " + deque);

        if (!deque.isEmpty()) {
            String removed = deque.remove();
            System.out.println("After remove(): " + deque + " (Removed: " + removed + ")");
        }

        if (!deque.isEmpty()) {
            String polled = deque.poll();
            System.out.println("After poll(): " + deque + " (Polled: " + polled + ")");
        }

        if (!deque.isEmpty()) {
            String pollLast = deque.pollLast();
            System.out.println("After pollLast(): " + deque + " (PollLast: " + pollLast + ")");
        }

        sc.close();
    }
}
