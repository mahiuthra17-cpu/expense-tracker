````markdown
# Expense Tracker

## Project Overview
This project is a simple Expense Tracker developed using Java. It allows users to add daily expenses, view all recorded expenses, and calculate the total amount spent through a menu-driven console application. This project is designed to demonstrate the basic concepts of Java and Object-Oriented Programming (OOP).

## Technologies Used
- Java

## Features
- Add a New Expense
- View All Expenses
- Calculate Total Expenses
- Store Expense Details Using ArrayList
- Menu-Driven Console Application

## Expense Details
The application stores the following information:
- Expense ID
- Expense Title
- Expense Category
- Expense Amount

## Project Structure
```
ExpenseTracker/
│── Main.java
│── Expense.java
│── ExpenseManager.java
│── README.md
```

## How to Run

1. Clone or download this repository.
2. Open the project in VS Code, Eclipse, or IntelliJ IDEA.
3. Compile the Java files:

```bash
javac Main.java Expense.java ExpenseManager.java
```

4. Run the application:

```bash
java Main
```

## Sample Output

```
===== Expense Tracker =====
1. Add Expense
2. View Expenses
3. Calculate Total
4. Exit

Enter your choice: 1

Enter Expense ID: 101
Enter Title: Food
Enter Category: Daily
Enter Amount: 250

Expense Added Successfully!

===== Expense Tracker =====
1. Add Expense
2. View Expenses
3. Calculate Total
4. Exit

Enter your choice: 2

ID    Title    Category    Amount
101   Food     Daily       ₹250.0

===== Expense Tracker =====
1. Add Expense
2. View Expenses
3. Calculate Total
4. Exit

Enter your choice: 3

Total Expense: ₹250.0
```

## Concepts Used
- Classes and Objects
- Constructors
- ArrayList
- Methods
- Loops
- Switch Case
- User Input using Scanner

## Future Enhancements
- Edit existing expenses
- Delete expense records
- Search expenses by category
- Store expense records in a MySQL database
- Generate monthly expense reports
- Add a graphical user interface (GUI)

## Author
**Mahi Sivajothi**
````



