package sekcja4;

public class FeetInchesConverter {
    // Challenge z lekcji 57
    // zmodyfikowany (druga metoda miała wywoływać pierwszą)

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        return feet * calcFeetAndInchesToCentimeters(12) + calcFeetAndInchesToCentimeters(inches);
    }


    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0) {
            return -1;
        }
        return inches * 2.54;
    }


}
