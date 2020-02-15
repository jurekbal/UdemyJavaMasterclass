package sekcja5;

public class SharedDigit {
    //Ćwiczenie z kodowania 18
    public static boolean hasSharedDigit(int a, int b){
        if (a < 10 || a > 99 | b < 10 || b > 99) {
            return false;
        }

        while (a > 0) {
            int pomB = b;
            int digitA = a % 10;
            while (pomB > 0) {
                if (digitA == (pomB % 10) ) {
                    return true;
                }
                pomB /= 10;
            }
            a /= 10;

        }

        return false;
    }
}
