package sekcja5;

public class PerfectNumber {
    // cw 22

    public static boolean isPerfectNumber(int number){
        if (number < 1){
            return false;
        } else {
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum == number) {
                return true;
            }
            return false;
        }
    }
}
