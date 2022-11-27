import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name, double transaction) {
        this.name = name;
        addTransaction(transaction);
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }

    public String getName() {
        return name;
    }

    public void printTransactions() {
        for(int i = 0; i < transactions.size(); i++)
            System.out.println("\t\tTransaction #" + i + " is " + transactions.get(i));
    }
}
