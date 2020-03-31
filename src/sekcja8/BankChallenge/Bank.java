package sekcja8.BankChallenge;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<>();

    public boolean addBranch(String name) {
        if (branchExists(name) == null) {
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialBallance) {
        Branch b = branchExists(branchName);
        if (b != null) {
            return b.addCustomer(customerName, initialBallance);
        }
        return false;
    }
    public boolean addTransaction(String branchName, String customerName, double value) {
        Branch b = branchExists(branchName);
        if (b != null) {
            b.addTransaction(customerName, value);
            return true;
        }
        return false;
    }

    public Branch getBranchByIndex(int index) {
        if (index >= 0 && index < branches.size()) {
            return branches.get(index);
        } else {
            return null;
        }
    }

    private Branch branchExists(String name) {
        boolean exists = false;
        for (Branch b: branches) {
            if ( b.getName().toLowerCase().equals(name.toLowerCase()) ) {
                return b;
            }
        }
        return null;
    }

    public void printBranchList() {
        if (branches.size() > 0) {
            for (int i = 0; i < branches.size(); i++) {
                Branch b = branches.get(i);
                System.out.println((i+1) + ": " + b.getName());
            }
        } else {
            System.out.println("No branches in bank");
        }
    }
}
