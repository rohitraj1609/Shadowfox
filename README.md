# Java Projects

This repository contains various Java projects developed to demonstrate different levels of programming concepts, from basic syntax to object-oriented programming and graphical user interface (GUI) development. Each project serves as a practical application of Java programming principles, showcasing essential functionalities and best practices.

## Table of Contents
1. [Enhanced Console-based Calculator](#1-enhanced-console-based-calculator)
2. [Simple Contact Management System](#2-simple-contact-management-system)
3. [Bank Account Management System](#3-bank-account-management-system)
4. [Inventory Management System with Basic GUI](#4-inventory-management-system-with-basic-gui)
5. [Getting Started](#getting-started)
6. [Future Considerations](#future-considerations)


---

## 1. Enhanced Console-based Calculator

This project implements a console-based calculator that performs various arithmetic operations and scientific calculations. The calculator supports the following functionalities:

### Features:
- **Basic Arithmetic Operations**: 
  - Addition
  - Subtraction
  - Multiplication
  - Division
- **Scientific Calculations**:
  - Square Root
  - Exponentiation (raising to a power)
- **Unit Conversions**:
  - Temperature (Celsius to Fahrenheit and vice versa)
  - Currency conversion (using predefined exchange rates)

### Key Learnings:
- Understanding basic Java syntax and structure.
- Implementation of methods for different functionalities.
- Error handling techniques to manage invalid inputs and exceptions.
- Exploration of additional mathematical operations beyond basic arithmetic.

---

## 2. Simple Contact Management System

This command-line application allows users to manage contacts effectively. Users can perform various operations to maintain a list of contacts without needing a database.

### Features:
- **Add Contacts**: Users can input details such as name, phone number, and email address to create a new contact.
- **View Contacts**: Display all stored contacts in a readable format.
- **Update Contacts**: Modify the information of existing contacts based on user input.
- **Delete Contacts**: Remove contacts from the system when they are no longer needed.

### Key Learnings:
- Implementation of CRUD (Create, Read, Update, Delete) operations.
- Use of Java collections (ArrayList) to manage dynamic lists of contacts.
- Handling user input and output through the console.
- Basic file I/O operations could be added in the future for persistent storage.

---

## 3. Bank Account Management System

This project simulates a banking system where users can manage their accounts, perform transactions, and track their financial activities.

### Features:
- **Deposit and Withdrawal**: Users can deposit money into their accounts and withdraw funds as needed.
- **Balance Inquiry**: Users can check their current account balance.
- **Transaction History**: Keeps a record of all deposits and withdrawals, providing a history for users to review.

### Key Learnings:
- Understanding object-oriented programming principles (classes, objects, methods).
- Unit testing with JUnit to validate functionalities, ensuring that methods work as intended.
- Implementation of error handling to manage exceptions (e.g., insufficient funds for withdrawals).
- Design considerations for a realistic banking application, including security and data integrity.

### Example Usage:
```java
Bank account = new Bank("John Doe");
account.deposit(100.0);
account.withdraw(50.0);
System.out.println("Current balance: $" + account.getBalance());
```

---

## 4. Inventory Management System with Basic GUI

This project implements a graphical user interface (GUI) using JavaFX or Swing, allowing users to manage inventory items effectively.

### Features:
- **Add Inventory Items**: Users can input item details (name, quantity, price) to add new items to the inventory.
- **Update Inventory Items**: Modify existing item details when stock levels change or prices are updated.
- **Delete Inventory Items**: Remove items that are no longer available or needed.

### Key Learnings:
- Designing and implementing a user-friendly GUI.
- Handling events (button clicks, text input) to interact with the user.
- Understanding how to connect GUI components with backend logic.
- Basic CRUD operations in a graphical environment.

### Example Usage:
```java
// Adding a new item through the GUI form
inventoryManager.addItem(new InventoryItem("Widget", 50, 19.99));
```

---

## Getting Started

To run the projects locally, follow these steps:

1. **Clone this repository**:
   ```bash
   git clone YOUR_GITHUB_REPO_URL
   ```

2. **Navigate to the project directory**:
   ```bash
   cd path/to/your/project
   ```

3. **Compile and run the Java files**:
   ```bash
   javac *.java
   java MainClassName
   ```
   Replace `MainClassName` with the name of the main class you wish to run (e.g., `Calculator`, `Contact`, `Bank`, or `Inventory`).

---

## Future Considerations

- **Calculator**: Consider adding advanced features such as graphing capabilities, complex number support, or a more sophisticated user interface.
- **Contact Management System**: Enhancements could include persistent storage with a database, search functionality, or categorization of contacts.
- **Bank Account Management System**: Future features could include loan management, interest calculations, and enhanced security measures (like authentication).
- **Inventory Management System**: Additional features might include reporting capabilities, integration with e-commerce platforms, and supplier management.

---
