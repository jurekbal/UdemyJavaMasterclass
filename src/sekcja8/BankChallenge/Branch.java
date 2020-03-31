package sekcja8.BankChallenge;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Branch(String name) {
        this.name = name;
    }

    public boolean addCustomer(String name, double initialBallance){
        if (customerExists(name) == null) {
            if (initialBallance >= 0.0) {
                customers.add(new Customer(name, initialBallance));
                return true;
            }
            System.out.println("Initial ballance have to be 0 or greater.");
            return false;
        } else {
            System.out.println("Customer name exists in database");
            return false;
        }
    }

    public boolean addTransaction(String customerName, double value) {
        Customer c = customerExists(customerName);
        if (c != null) {
            c.addTransaction(value);
            return true;
        } else {
            System.out.println("Customer name don't exists.");
            return false;
        }
    }

    private Customer customerExists(String name) {
        boolean exists = false;
        for (Customer c: customers) {
            if (c.getName().toLowerCase().equals(name.toLowerCase()) ) {
                return c;
            }
        }
        return null;
    }

    public void printCustomerList() {
        for (int i = 0; i < customers.size(); i++) {
            Customer c = customers.get(i);
            System.out.println((i+1) + ": " + c.getName());
        }
    }

    public boolean printCustomerTransactions(String customerName) {
        Customer c = customerExists(customerName);
        if (c != null) {
            c.printTransactions();
            return true;
        }
        return false;
    }

    public String getName() {
        return this.name;
    }
}
