package sekcja11.scope;

import java.util.Scanner;

// all variables (except scanner) have to be named "x"
public class Main {
    private static int x;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your number:");
        Main.x = scanner.nextInt();
        for (int x = 1; x <= 12; x++) {
            System.out.println(Main.x*x);
        }

    }
}
