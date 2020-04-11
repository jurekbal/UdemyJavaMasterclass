package sekcja8.arrayListChallenge;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    private static Scanner local_scanner = new Scanner(System.in);

    public String showMenuAndGetUserChoice() {
        showMenu();
        return scanner.nextLine();
    }

    private void showMenu() {
        System.out.println("Contacts list");
        System.out.println("0 - quit");
        System.out.println("1 - list all contacts");
        System.out.println("2 - add new contact");
        System.out.println("3 - modify contact");
        System.out.println("4 - remove contact");
        System.out.println("5 - search/find contacts");
        System.out.print("Choice:");
    }

    public static void promptAndWait(){
        System.out.println("Press enter...");
        waitForEnter();
    }

    public static void waitForEnter(){
        local_scanner.nextLine();
    }
}
