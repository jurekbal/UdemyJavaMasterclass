package sekcja5;

public class LastDigitChecker {
    // Ćw z kodowania 19

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isValid(a) && isValid(b) && isValid(c)){
            int lastA = a % 10;
            int lastB = b % 10;
            int lastC = c % 10;
            if (lastA == lastB || lastA == lastC || lastB == lastC) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int num){
        if (num < 10 || num > 1000) {
            return false;
        }
        return true;
    }
}
