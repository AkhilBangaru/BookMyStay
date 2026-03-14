# BookMyStay – Use Case 2

## Basic Room Types & Static Availability

### Overview

This use case demonstrates the implementation of **basic hotel room types** and **room availability tracking** in the BookMyStay application.
The system defines different room categories and manages the number of available rooms using **static variables**.
It also simulates a simple **room booking operation** and updates the availability accordingly.

### Objectives

* Define different types of hotel rooms.
* Maintain a fixed number of available rooms for each type.
* Demonstrate how static variables can represent shared system state.
* Simulate booking a room and updating availability.

### Room Types Implemented

The application supports three basic room categories:

| Room Type   | Price per Night |
| ----------- | --------------- |
| Single Room | $100            |
| Double Room | $150            |
| Suite Room  | $250            |

### Key Concepts Used

**Classes**
A class is used to represent a hotel room with attributes such as type and price.

**Constructors**
Constructors initialize room objects when they are created.

**Static Variables**
Static variables store the number of available rooms for each category.
Since static variables belong to the class, the availability is shared across all room objects.

**Methods**
Methods are used to display room information, check availability, and perform booking operations.

**Switch Statement**
A switch statement determines which type of room is being booked and updates the corresponding availability.

**Console Output**
The program uses console output to display room details and booking results.

### Key Requirements

* Create a class representing a hotel room.
* Define room types such as Single, Double, and Suite.
* Maintain room availability using static variables.
* Implement methods to display room information.
* Implement a booking method that decreases available rooms.
* Display updated availability after booking.

### Expected Output

The program prints:

* List of available room types
* Price per night for each room
* Initial availability of rooms
* Booking confirmation message
* Updated room availability

Example output:

```
Hotel Booking Management System
Use Case 2: Basic Room Types & Availability

Room Types Available:

Single Room
Price per night: $100

Double Room
Price per night: $150

Suite Room
Price per night: $250

Current Room Availability:
Single Rooms: 3
Double Rooms: 2
Suite Rooms: 1

Booking a Single Room...

Single room booked successfully.

Current Room Availability:
Single Rooms: 2
Double Rooms: 2
Suite Rooms: 1
```

### File Structure

```
BookMyStay
 └── src
     └── UseCase2RoomTypes.java
```

### How to Compile

```
javac UseCase2RoomTypes.java
```

### How to Run

```
java UseCase2RoomTypes
```

### Benefits

* Demonstrates simple object-oriented design.
* Introduces static variables for system-wide data.
* Provides a foundation for future features like booking management and customer interaction.

### Future Enhancements

* Add user input for booking rooms.
* Store room details using collections.
* Implement customer booking records.
* Add cancellation functionality.
* Integrate with a full hotel booking workflow.