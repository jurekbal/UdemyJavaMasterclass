package sekcja8.BankChallenge;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<>();

    public boolean addBranch(String name) {
        if (!branchExists(name)) {
            branches.add(new Branch(name));
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

    private boolean branchExists(String name) {
        boolean exists = false;
        for (Branch b: branches) {
            if ( b.getName().toLowerCase().equals(name.toLowerCase()) ) {
                exists = true;
                //System.out.println("Branch name exists in database.");
                break;
            }
        }
        return exists;
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
