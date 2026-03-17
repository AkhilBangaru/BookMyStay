# Book My Stay App  
## Use Case 6: Reservation Confirmation & Room Allocation  

### Overview  
Confirms bookings and assigns rooms while preventing double allocation.

### Features  
- Assign unique room IDs  
- Update inventory after booking  
- Prevent duplicate room allocation  

### Concept  
- HashMap → room availability  
- Set → unique room IDs  
- Atomic allocation logic  

### How to Run  
javac RoomAllocationApp.java  
java RoomAllocationApp  

### Output  
Shows booking confirmations with assigned room IDs.