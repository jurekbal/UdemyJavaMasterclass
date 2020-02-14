package sekcja4;

public class TeenNumberChecker {
    //Ćwiczenie z kodowania nr 7

    public static boolean isTeen(int age){
        if (age >= 13 && age <= 19) {
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int a, int b, int c){
        if (isTeen(a) || isTeen(b) || isTeen(c)){
            return true;
        }
        return false;
    }
}
