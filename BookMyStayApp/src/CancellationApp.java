import java.util.*;

// Booking class
class Booking {
    int roomNumber;
    String guestName;
    boolean isActive;

    Booking(int roomNumber, String guestName) {
        this.roomNumber = roomNumber;
        this.guestName = guestName;
        this.isActive = true;
    }
}

public class CancellationApp {

    static ArrayList<Booking> bookings = new ArrayList<>();

    // Add booking
    public static void addBooking(int room, String name) {
        bookings.add(new Booking(room, name));
    }

    // Cancel booking
    public static void cancelBooking(int room) {
        for (Booking b : bookings) {
            if (b.roomNumber == room && b.isActive) {
                b.isActive = false;
                System.out.println("✅ Booking cancelled for Room " + room);
                return;
            }
        }
        System.out.println("❌ Booking not found.");
    }

    // Show active bookings
    public static void showBookings() {
        System.out.println("\n📋 Active Bookings:");
        for (Booking b : bookings) {
            if (b.isActive) {
                System.out.println("Room " + b.roomNumber + " -> " + b.guestName);
            }
        }
    }

    // Show available rooms
    public static void showAvailableRooms() {
        Set<Integer> bookedRooms = new HashSet<>();
        for (Booking b : bookings) {
            if (b.isActive) {
                bookedRooms.add(b.roomNumber);
            }
        }

        System.out.println("\n🏨 Available Rooms:");
        for (int i = 1; i <= 5; i++) {
            if (!bookedRooms.contains(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Sample bookings
        addBooking(1, "Akhil");
        addBooking(2, "Ravi");

        showBookings();
        showAvailableRooms();

        // Cancel a booking
        cancelBooking(1);

        showBookings();
        showAvailableRooms();
    }
}