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
        for (Branch b : branches) {
            System.out.println(b.getName());
        }
    }
}
