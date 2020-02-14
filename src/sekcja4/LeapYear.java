package sekcja4;

public class LeapYear {
// Cwiczenie z kodowania 4

    public static boolean isLeapYear(int year){
        // check if is in range 1..9999
        if (year < 1 || year > 9999){
            return false;
        }

        if ( (year % 4) != 0 ) {
            return false;
        }else  {
            if ( (year % 100) != 0) {
                return true;
            } else {
                if ( (year % 400) == 0 ) {
                    return true;
                } else {
                    return false;
                }
            }
        }

    }
}
