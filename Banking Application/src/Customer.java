import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public Customer(String name, double initialtrans) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        makeTransaction(initialtrans);
    }

    public void makeTransaction(double trans) {
        transactions.add(trans);
    }
}