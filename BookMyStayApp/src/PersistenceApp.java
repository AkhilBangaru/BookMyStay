import java.io.*;
import java.util.*;

// Booking class
class Booking implements Serializable {
    String guestName;
    int roomNumber;

    Booking(String guestName, int roomNumber) {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
    }

    void display() {
        System.out.println(guestName + " -> Room " + roomNumber);
    }
}

public class PersistenceApp {

    static final String FILE_NAME = "bookings.dat";

    // Save bookings to file
    public static void saveData(ArrayList<Booking> list) {
        try (ObjectOutputStream oos =
                 new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(list);
            System.out.println("✅ Data saved successfully.");
        } catch (IOException e) {
            System.out.println("❌ Error saving data.");
        }
    }

    // Load bookings from file
    public static ArrayList<Booking> loadData() {
        try (ObjectInputStream ois =
                 new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (ArrayList<Booking>) ois.readObject();
        } catch (Exception e) {
            System.out.println("⚠️ No previous data found. Starting fresh.");
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {

        ArrayList<Booking> bookings = loadData();

        // Add sample booking
        bookings.add(new Booking("Akhil", 101));
        bookings.add(new Booking("Ravi", 202));

        // Display bookings
        System.out.println("\n📜 Current Bookings:");
        for (Booking b : bookings) {
            b.display();
        }

        // Save data
        saveData(bookings);
    }
}