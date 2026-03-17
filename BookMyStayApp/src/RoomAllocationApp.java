import java.util.*;

/**
 * Use Case 6: Reservation Confirmation & Room Allocation
 */
public class RoomAllocationApp {

    // Inventory (room type -> available count)
    private static Map<String, Integer> inventory = new HashMap<>();

    // Track assigned room IDs to avoid duplicates
    private static Set<String> assignedRooms = new HashSet<>();

    // Initialize inventory
    public static void initInventory() {
        inventory.put("Single", 2);
        inventory.put("Double", 2);
        inventory.put("Suite", 1);
    }

    // Allocate room and confirm booking
    public static void allocateRoom(String guest, String roomType) {

        int available = inventory.getOrDefault(roomType, 0);

        if (available <= 0) {
            System.out.println("No available rooms for " + roomType);
            return;
        }

        // Generate unique room ID
        String roomId = generateRoomId(roomType);

        // Assign room
        assignedRooms.add(roomId);

        // Update inventory
        inventory.put(roomType, available - 1);

        // Confirmation
        System.out.println("Booking confirmed for " + guest +
                ", Room ID: " + roomId);
    }

    // Generate unique room ID
    private static String generateRoomId(String roomType) {
        String id;
        do {
            id = roomType.substring(0, 1).toUpperCase() +
                    (int)(Math.random() * 100);
        } while (assignedRooms.contains(id));

        return id;
    }

    public static void main(String[] args) {

        initInventory();

        // Simulate bookings (FIFO assumed from previous use case)
        allocateRoom("John", "Single");
        allocateRoom("Alice", "Double");
        allocateRoom("Bob", "Suite");

        // Try overbooking
        allocateRoom("ExtraUser", "Suite");
    }
}