package sekcja5;

public class GreatestCommonDivisor {
    // Cw z kodowania 19

    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10) {
            return -1;
        }
        int mniejsza;
        int wieksza;
        if (first < second) {
            mniejsza = first;
            wieksza = second;
        } else {
            mniejsza = second;
            wieksza = first;
        }

        int nmd = 0;
        for (int i = 1; i <= mniejsza; i++) {
            if ( (mniejsza % i == 0) && (wieksza % i == 0) ) {
                nmd = i;
            }
        }
        return nmd;
    }
}
