package sekcja5;

public class NumberOfDaysInMonth {
    // Ćwiczenie z kodowania nr 13

    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 30;
        }
    }

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
