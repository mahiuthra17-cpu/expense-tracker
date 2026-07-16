import java.util.ArrayList;

public class ExpenseManager {

    private ArrayList<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {
        expenses.add(expense);
        System.out.println("Expense Added Successfully!");
    }

    public void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }

        System.out.println("\nID\tTitle\tCategory\tAmount");
        for (Expense expense : expenses) {
            expense.display();
        }
    }

    public void calculateTotal() {
        double total = 0;

        for (Expense expense : expenses) {
            total += expense.getAmount();
        }

        System.out.println("Total Expense: ₹" + total);
    }
}
