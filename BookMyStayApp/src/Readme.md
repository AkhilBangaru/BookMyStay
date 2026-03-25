# Book My Stay App  
## Use Case 12: Data Persistence & System Recovery  

### Overview  
This feature ensures that booking data is saved permanently and can be restored when the system restarts. It prevents data loss and allows recovery of previous bookings.

---

### Features  
- Save booking data to file  
- Load data when application restarts  
- Maintain persistent storage  
- Recover system state  

---

### Concept  
- **File Handling** → Store data in files  
- **Serialization** → Save objects  
- **Deserialization** → Load objects  
- **Exception Handling** → Handle file errors  

---

### How to Run  
javac PersistenceApp.java  
java PersistenceApp  

---

### Sample Case  
- Add bookings  
- Restart program  
- Data is restored from file  

---

### Output  
- Displays saved bookings  
- Restores previous state  
- Confirms successful persistence  