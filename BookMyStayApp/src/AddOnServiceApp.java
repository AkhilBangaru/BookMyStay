import java.util.*;

// Booking class to store details
class Booking {
    String guestName;
    int roomNumber;
    String date;

    Booking(String guestName, int roomNumber, String date) {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.date = date;
    }

    void display() {
        System.out.println(guestName + " -> Room " + roomNumber + " -> " + date);
    }
}

// Main application class
public class BookingHistoryApp {

    static ArrayList<Booking> history = new ArrayList<>();

    // Add booking
    public static void addBooking(String name, int room, String date) {
        history.add(new Booking(name, room, date));
    }

    // View all bookings
    public static void viewBookings() {
        System.out.println("\n📜 Booking History:");
        for (Booking b : history) {
            b.display();
        }
    }

    // Generate report
    public static void generateReport() {
        System.out.println("\n📊 Report:");
        System.out.println("Total Bookings: " + history.size());
    }

    public static void main(String[] args) {

        // Sample data
        addBooking("Akhil", 101, "10-03-2026");
        addBooking("Ravi", 202, "12-03-2026");
        addBooking("Sneha", 303, "15-03-2026");

        // Display data
        viewBookings();
        generateReport();
    }
}