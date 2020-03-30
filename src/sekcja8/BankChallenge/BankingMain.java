package sekcja8.BankChallenge;

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
                    break;
                }
                case "2" : {
                    addBranch();
                }
                default: {
                    System.out.println("No such option");
                }
            }
        } while (!choice.equals("0"));
    }

    private static void addBranch() {
        System.out.println("");
//TODO here
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
                        "3 - Select branch for further operations");
    }
}
