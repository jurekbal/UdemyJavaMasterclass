package sekcja5;

import java.util.Scanner;

public class InputCalculator {
    // Cw z kodowania 27

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        int count = 0;
        int number;

        while (true){
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                count++;
                sum+= number;
            } else {
                break;
            }
        }

        if (count > 0) {
            avg = (double) sum / (double) count;
        }

        System.out.println("SUM = " + sum + " AVG = " + (long) Math.round( avg ));

        scanner.close();
    }
}
