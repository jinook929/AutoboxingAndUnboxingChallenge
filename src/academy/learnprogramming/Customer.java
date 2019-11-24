package academy.learnprogramming;

import java.util.ArrayList;

public class Customer {
    // Fields
    private String name;
    private ArrayList<Double> transactions;

    // Constructor
    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    // Getters
    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    // Add a transaction
    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }
}
