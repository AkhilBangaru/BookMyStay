# Book My Stay App

## Use Case 3: Centralized Room Inventory Management

### Overview

A simple system to manage hotel room availability using a centralized inventory.

### Features

* Add room types
* Book rooms
* Cancel bookings
* View available rooms

### Concept

Uses a **HashMap** as a single source of truth:
Room Type → Available Count

### How to Run

```bash
javac RoomInventoryApp.java
java RoomInventoryApp
```

### Output

Displays room availability before and after booking/cancellation