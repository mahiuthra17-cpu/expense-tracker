````markdown
# Expense Tracker

## Project Overview
This project is a simple Expense Tracker developed using Java. It allows users to record daily expenses, view all recorded expenses, and calculate the total amount spent through a menu-driven console application. The project demonstrates the fundamentals of Object-Oriented Programming (OOP) and Java programming concepts.

## Technologies Used
- Java

## Features
- Add a New Expense
- View All Expenses
- Calculate Total Expenses
- Store Expense Details
- Menu-Driven Console Application
- Simple and User-Friendly Interface

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

1. Download or clone the repository.
2. Open the project in any Java IDE (Eclipse, IntelliJ IDEA, or VS Code).
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

## Future Enhancements
- Store expense records in a MySQL database
- Add edit and delete expense functionality
- Generate monthly and yearly expense reports
- Add user login authentication
- Export expense reports to PDF or Excel
- Develop a graphical user interface (GUI)

## Author
**Mahi Sivajothi**

---
⭐ If you found this project useful, consider giving it a star on GitHub!
````
