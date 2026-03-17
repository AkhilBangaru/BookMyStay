import java.util.HashMap;
import java.util.Map;

/**
 * Use Case 4: Room Search & Availability Check
 */
public class RoomSearchApp {

    // Centralized inventory (read-only for search)
    private static Map<String, Integer> inventory = new HashMap<>();

    // Initialize inventory
    public static void initInventory() {
        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 2);
    }

    // Search available rooms (read-only access)
    public static void searchAvailableRooms() {
        System.out.println("\nRoom Search Results:");

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println(entry.getKey() +
                        " -> Available: " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        initInventory();
        searchAvailableRooms();
    }
}