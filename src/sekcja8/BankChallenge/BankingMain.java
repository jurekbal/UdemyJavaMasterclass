package sekcja8.BankChallenge;

import java.util.ArrayList;
import java.util.Scanner;

// Challenge 112.
public class BankingMain {
    private static Bank bank = new Bank();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String choice;

        do {
            printMenu();
            choice = getUserInput();
            switch (choice) {
                case "0": {
                    break;
                }
                case "1": {
                    bank.printBranchList();
                    pressEnter();
                    break;
                }
                case "2" : {
                    addBranch();
                    break;
                }
                case "3" : {
                    branchOperations();
                    break;
                }
                default: {
                    System.out.println("No such option");
                }
            }
        } while (!choice.equals("0"));
    }

    private static void branchOperations() {
        Branch b = getBranchFromUser();
        if (b != null ) {
            String userInput;
            do {
                printBranchMenu(b);
                userInput = getUserInput();
                switch (userInput) {
                    case "0" : {
                        break;
                    }
                    case "1" : {
                        b.printCustomerList();
                        pressEnter();
                        break;
                    }
                    case "2" : {
                        printCustomerTransactions(b);
                        pressEnter();
                        break;
                    }
                    case "3" : {
                        addTransaction(b);
                        pressEnter();
                        break;
                    }
                    case "4" : {
                        addNewCustomer(b);
                        pressEnter();
                        break;
                    }
                    default: {
                        System.out.println("No such option");
                    }
                }
            } while (!userInput.equals("0"));
        } else {
            System.out.println("Error. No such branch.");
            pressEnter();
        }
    }

    private static void addTransaction(Branch b) {
        b.printCustomerList();
        System.out.print("New transaction - enter customer name:");
        String customerName = getUserInput();
        System.out.print("New transaction - enter transaction value:");
        double value = Double.parseDouble(getUserInput());
        if( b.addTransaction(customerName, value)) {
            System.out.println("Transaction succeed");
        } else {
            System.out.println("Transaction error");
        }
    }

    private static void addNewCustomer(Branch b) {
        System.out.print("Enter new customer name:");
        String customerName = getUserInput();
        System.out.print("Enter initial ballance(use \".\" as decimal separator):");
        double initialBallance = Double.parseDouble(getUserInput());
        if(b.addCustomer(customerName, initialBallance)) {
            System.out.println("Customer " + customerName + " has been successfully added.");
        } else {
            System.out.println("Errod. Customer has not been added");
        }
    }

    private static void printCustomerTransactions(Branch b) {
        b.printCustomerList();
        System.out.print("Enter customer name:");
        String customerName = getUserInput();
        if(!b.printCustomerTransactions(customerName)) {
            System.out.println("No such customer!");
        }
    }

    private static Branch getBranchFromUser() {
        bank.printBranchList();
        System.out.print("Choose branch number to work on:");
        int branchIndex = Integer.parseInt(getUserInput()) - 1;
        return bank.getBranchByIndex(branchIndex);
    }

    private static void printBranchMenu(Branch b) {
        System.out.print("Selct option for branch " + b.getName() + ":\n" +
                "0 - back\n" +
                "1 - list all customers in branch\n" +
                "2 - list transactions of customer\n" +
                "3 - add transaction\n" +
                "4 - add new customer\n" +
                "Choose option:");

    }

    private static void addBranch() {
        System.out.print("Adding new branch\nEnter name of branch to add:");
        bank.addBranch(getUserInput());
    }

    private static String getUserInput() {
        return scanner.nextLine();
    }

    private static void printMenu() {
        System.out.print(
                "Select option:\n" +
                        "0 - quit program\n" +
                        "1 - List branches\n" +
                        "2 - Add branch\n" +
                        "3 - Select branch for further operations\n" +
                        "Choose option:");
    }

    private static void pressEnter(){
        System.out.print("Press enter...");
        scanner.nextLine();
    }
}
