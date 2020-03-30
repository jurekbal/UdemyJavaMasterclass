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
            printBranchMenu(b);
            String s = getUserInput();
            //TODO The line where works take place
        } else {
            System.out.println("Error. No such branch.");
            pressEnter();
        }
    }

    private static Branch getBranchFromUser() {
        bank.printBranchList();
        System.out.print("Choose branch number to work on:");
        int branchIndex = Integer.parseInt(getUserInput()) - 1;
        return bank.getBranchByIndex(branchIndex);
    }

    private static void printBranchMenu(Branch b) {
        System.out.println("Selct option for branch " + b.getName() + ":\n" +
                "0 - back\n" +
                "1 - list all customers in branch\n" +
                "2 - list transactions od customer\n" +
                "3 - add transaction\n" +
                "4 - add customer");

    }

    private static void addBranch() {
        System.out.print("Adding new branch\nEnter name of branch to add:");
        bank.addBranch(getUserInput());
    }

    private static String getUserInput() {
        return scanner.nextLine();
    }

    private static void printMenu() {
        System.out.println(
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
