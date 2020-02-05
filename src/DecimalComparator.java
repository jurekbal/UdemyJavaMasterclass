public class DecimalComparator {
    // Cwiczenie z kodowania nr 5

    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        int foo = (int) (a * 1000.0);
        int bar = (int) (b * 1000.0);
        if (foo == bar) {
            return true;
        } else{
            return false;
        }
    }
}
