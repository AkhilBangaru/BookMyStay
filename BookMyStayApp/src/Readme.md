# Book My Stay App  
## Use Case 10: Booking Cancellation & Inventory Rollback  

### Overview  
This feature allows users to cancel bookings and ensures that the room inventory is updated accordingly. When a booking is cancelled, the room becomes available again.

---

### Features  
- Cancel an existing booking  
- Update room availability after cancellation  
- Maintain accurate inventory  
- Display updated booking status  

---

### Concept  
- **ArrayList** → Store bookings  
- **Boolean Flag** → Track room availability  
- **Methods** → Handle cancellation & updates  
- **OOP Concepts** → Manage booking data  

---

### How to Run  
javac CancellationApp.java  
java CancellationApp  

---

### Sample Case  
- Booking: Room 101 → Akhil  
- Cancel Booking → Room becomes available again  

---

### Output  
- Displays cancellation confirmation  
- Updates room status  
- Shows available rooms after rollback  