# Book My Stay App  
## Use Case 11: Concurrent Booking Simulation  

### Overview  
This feature simulates multiple users trying to book rooms at the same time. It ensures thread safety so that no two users can book the same room simultaneously.

---

### Features  
- Simulate multiple users (threads)  
- Prevent double booking  
- Ensure thread-safe operations  
- Display booking results  

---

### Concept  
- **Multithreading** → Simulate concurrent users  
- **Synchronization** → Prevent race conditions  
- **Shared Resource** → Room booking system  
- **Thread Class** → Create user threads  

---

### How to Run  
javac ConcurrentBookingApp.java  
java ConcurrentBookingApp  

---

### Sample Case  
- User1 and User2 try booking Room 1 simultaneously  
- Only one booking succeeds  

---

### Output  
- Shows which user successfully booked  
- Prevents duplicate bookings  
- Demonstrates thread safety  