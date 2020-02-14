package sekcja4;

public class MinutesToYearsDaysCalculator {
    // Ćwiczenie z kodowania nr 9.

    public static final long MINUTES_IN_DAY = 60 * 24;
    public static final long MINUTES_IN_YEAR = MINUTES_IN_DAY * 365;

    public static void printYearsAndDays(long minutes){
        if (minutes < 0 ){
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + minutes / MINUTES_IN_YEAR + " y and " + ( (minutes % MINUTES_IN_YEAR) / MINUTES_IN_DAY ) + " d");
        }
    }
}
