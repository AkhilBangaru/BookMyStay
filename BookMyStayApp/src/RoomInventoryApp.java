import java.util.HashMap;
import java.util.Map;

/**
 * Use Case 3: Centralized Room Inventory Management
 * Single-file version
 */
public class RoomInventoryApp {

    // Centralized inventory (Single Source of Truth)
    private static Map<String, Integer> inventory = new HashMap<>();

    // Add room type
    public static void addRoomType(String roomType, int count) {
        inventory.put(roomType, count);
    }

    // Get available rooms
    public static int getAvailableRooms(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    // Book room
    public static boolean bookRoom(String roomType) {
        int available = getAvailableRooms(roomType);

        if (available > 0) {
            inventory.put(roomType, available - 1);
            return true;
        } else {
            System.out.println("No rooms available for: " + roomType);
            return false;
        }
    }

    // Cancel booking
    public static void cancelRoom(String roomType) {
        int available = getAvailableRooms(roomType);
        inventory.put(roomType, available + 1);
    }

    // Display inventory
    public static void displayInventory() {
        System.out.println("\nRoom Inventory Status:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " -> Available Rooms: " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        // Initialize inventory
        addRoomType("Single Room", 5);
        addRoomType("Double Room", 3);
        addRoomType("Suite Room", 2);

        // Initial state
        displayInventory();

        // Booking
        System.out.println("\nBooking Single Room...");
        bookRoom("Single Room");

        System.out.println("Booking Double Room...");
        bookRoom("Double Room");

        displayInventory();

        // Cancellation
        System.out.println("\nCancelling Single Room...");
        cancelRoom("Single Room");

        displayInventory();
    }
}