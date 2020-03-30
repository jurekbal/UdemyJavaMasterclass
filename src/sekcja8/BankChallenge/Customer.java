package sekcja8.BankChallenge;

import java.util.ArrayList;
import java.util.function.DoubleToIntFunction;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name, double initialBalance) {
        this.name = name;
        this.transactions.add(Double.valueOf(initialBalance));
    }

    public Customer(String name) {
        this.name = name;
        this.transactions.add(Double.valueOf(0.0));
    }

    public void addTransaction (double value) {
        transactions.add(Double.valueOf(value));
    }

    public void printTransactions() {
        for (Double t: transactions) {
            System.out.println(t.doubleValue());
        }
    }

    public String getName() {
        return name;
    }
}
