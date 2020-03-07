package sekcja5;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MinAndMaxInputChallengeL74 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isInit = true;
        int number;
//        int min = 0;
//        int max = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter number:");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();

//                if (isInit) {
//                    min = number;
//                    max = number;
//                    isInit = false;
//                }

                isInit = false;

                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            } else {
                if (isInit) {
                    System.out.println("No input.");
                } else {
                    System.out.println("Min is: " + min);
                    System.out.println("Max is: " + max);
                }
                break;
            }

        }
        scanner.close();
    }
}
