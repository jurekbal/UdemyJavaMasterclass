package sekcja4;

public class BarkingDog {
// Cwiczenie z kodowania 3
    
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean wakeUp = false;
        if (barking){
            if (hourOfDay >= 0){
                if (hourOfDay < 8){
                    wakeUp = true;
                } else if (hourOfDay > 22 && hourOfDay <= 23) {
                    wakeUp = true;
                }
            }
        }
        return wakeUp;
    }

}
