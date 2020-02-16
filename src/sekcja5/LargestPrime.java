package sekcja5;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        int maxPrime = -1;
        if (number < 2) {
            return -1;
        }

        while (number % 2 == 0) {
            maxPrime = 2;
            number /= 2;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                maxPrime = i;
                number /= i;
            }
        }

        if (number > 2)
            maxPrime = number;

        return maxPrime;
    }

}
