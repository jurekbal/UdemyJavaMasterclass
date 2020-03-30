package sekcja8.BankChallenge;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Branch(String name) {
        this.name = name;
    }

    public boolean addCustomer(String name, double initialBallance){
        if (!customerExists(name)) {
            if (initialBallance >= 0.0) {
                customers.add(new Customer(name, initialBallance));
                return true;
            }
            System.out.println("Initial ballance have to be 0 or greater.");
            return false;
        } else {
            return false;
        }
    }

    public void doTransaction(Customer c, double value) {
        if (customerExists(c.getName())) {
            c.addTransaction(value);
        } else {
            System.out.println("Customer name don't exists.");
        }
    }

    private boolean customerExists(String name) {
        boolean exists = false;
        for (Customer c: customers) {
            if ( c.getName().toLowerCase().equals(name.toLowerCase()) ) {
                exists = true;
                //System.out.println("Customer name exists in database.");
                break;
            }
        }
        return exists;
    }

    public void printCustomerList(boolean withTransactions) {
        for (Customer c: customers) {
            System.out.println(c.getName());
            if (withTransactions) {
                c.printTransactions();
                System.out.println("------------");
            }
        }
    }

    public String getName() {
        return this.name;
    }
}
