import java.util.*;

public class ValidationApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            if (name.isEmpty()) {
                throw new IllegalArgumentException("❌ Name cannot be empty.");
            }

            System.out.print("Enter room number (1-10): ");
            int room = sc.nextInt();

            if (room < 1 || room > 10) {
                throw new IllegalArgumentException("❌ Invalid room number.");
            }

            System.out.println("✅ Booking Successful!");
            System.out.println("Name: " + name);
            System.out.println("Room: " + room);

        } catch (InputMismatchException e) {
            System.out.println("❌ Invalid input type! Please enter numbers only.");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("❌ Unexpected error occurred.");

        } finally {
            System.out.println("🔄 Program executed.");
        }
    }
}