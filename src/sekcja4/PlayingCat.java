package sekcja4;

public class PlayingCat {
    // Ćwiczenie z kodowania 11.

    public static boolean isCatPlaying (boolean summer, int temperature){
        if (temperature < 25 || temperature > 45) {
            return false;
        } else if (!summer && temperature > 35) {
            return false;
        } else {
            return true;
        }
    }
}
