import java.util.LinkedList;
import java.util.Queue;

/**
 * Use Case 5: Booking Request (First-Come-First-Served)
 */
public class BookingFCFSApp {

    // Queue to maintain booking requests
    private static Queue<String> bookingQueue = new LinkedList<>();

    // Add booking request
    public static void addRequest(String request) {
        bookingQueue.add(request);
        System.out.println("Request added: " + request);
    }

    // Process booking request (FCFS)
    public static void processRequest() {
        if (bookingQueue.isEmpty()) {
            System.out.println("No booking requests to process.");
            return;
        }

        String request = bookingQueue.poll(); // removes first element
        System.out.println("Processing booking: " + request);
    }

    // Display queue
    public static void displayQueue() {
        System.out.println("\nCurrent Booking Queue: " + bookingQueue);
    }

    public static void main(String[] args) {

        // Add booking requests
        addRequest("John - Single Room");
        addRequest("Alice - Double Room");
        addRequest("Bob - Suite Room");

        displayQueue();

        // Process requests (FCFS order)
        processRequest();
        processRequest();

        displayQueue();
    }
}