package sekcja5;

public class NumberPalindrome {
    //Ćw z kod. nr 15

    public static boolean isPalindrome(int number){
        int num = number;
        int reversed = 0;

        while (num > 0 || num < 0){
            reversed += num % 10;
            num /= 10;
            reversed *= 10;
        }
        reversed /= 10;

        if ((number == reversed) || (number == -reversed)){
            return true;
        } else {
            return false;
        }
    }
}
