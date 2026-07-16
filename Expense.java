public class Expense {

    private int id;
    private String title;
    private String category;
    private double amount;

    public Expense(int id, String title, String category, double amount) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public void display() {
        System.out.println(id + "\t" + title + "\t" + category + "\t₹" + amount);
    }
}
