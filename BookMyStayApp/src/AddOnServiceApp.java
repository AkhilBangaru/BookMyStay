import java.util.*;

/**
 * Use Case 7: Add-On Service Selection
 */
public class AddOnServiceApp {

    // Store available services with cost
    private static Map<String, Integer> services = new HashMap<>();

    // Store selected services for a reservation
    private static List<String> selectedServices = new ArrayList<>();

    // Initialize services
    public static void initServices() {
        services.put("Breakfast", 200);
        services.put("WiFi", 100);
        services.put("Airport Pickup", 500);
    }

    // Add service to reservation
    public static void addService(String service) {
        if (services.containsKey(service)) {
            selectedServices.add(service);
            System.out.println(service + " added.");
        } else {
            System.out.println("Service not available.");
        }
    }

    // Calculate total cost
    public static int calculateTotal() {
        int total = 0;
        for (String s : selectedServices) {
            total += services.get(s);
        }
        return total;
    }

    // Display selected services
    public static void displayServices() {
        System.out.println("\nSelected Services: " + selectedServices);
        System.out.println("Total Add-on Cost: " + calculateTotal());
    }

    public static void main(String[] args) {

        initServices();

        // Simulate selection
        addService("Breakfast");
        addService("WiFi");

        displayServices();
    }
}