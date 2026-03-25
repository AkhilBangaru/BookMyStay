class BookingSystem {

    private boolean isBooked = false;

    // synchronized method to prevent race condition
    public synchronized void bookRoom(String user) {
        if (!isBooked) {
            System.out.println(user + " is trying to book...");
            try {
                Thread.sleep(1000); // simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            isBooked = true;
            System.out.println("✅ " + user + " successfully booked the room.");
        } else {
            System.out.println("❌ " + user + " failed. Room already booked.");
        }
    }
}

// Thread class
class User extends Thread {
    BookingSystem system;
    String userName;

    User(BookingSystem system, String userName) {
        this.system = system;
        this.userName = userName;
    }

    public void run() {
        system.bookRoom(userName);
    }
}

// Main class
public class ConcurrentBookingApp {

    public static void main(String[] args) {

        BookingSystem system = new BookingSystem();

        User u1 = new User(system, "User1");
        User u2 = new User(system, "User2");

        u1.start();
        u2.start();
    }
}