package sekcja5;

public class NumberToWords {
    // cw 23

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }

        String output = "";
        int reversedNumber = reverse(number);
        int digitCount = getDigitCount(number);
        for (int i = 0; i < digitCount; i++) {
            //output += digitToWord(reversedNumber % 10);
            switch (reversedNumber % 10) {
                case 0: output += "Zero"; break;
                case 1: output += "One"; break;
                case 2: output += "Two"; break;
                case 3: output += "Three"; break;
                case 4: output += "Four"; break;
                case 5: output += "Five"; break;
                case 6: output += "Six"; break;
                case 7: output += "Seven"; break;
                case 8: output += "Eight"; break;
                case 9: output += "Nine"; break;
                default: output += "ERROR"; break;
            }
            reversedNumber /= 10;
            if (i < digitCount - 1) {
                output += " ";
            }
        }
        System.out.println(output);
    }

//    private static String digitToWord(int digit){
//        if (digit < 0 || digit > 9) {
//            return "Invalid Digit";
//        }
//        switch (digit) {
//            case 0: return "Zero";
//            case 1: return "One";
//            case 2: return "Two";
//            case 3: return "Three";
//            case 4: return "Four";
//            case 5: return "Five";
//            case 6: return "Six";
//            case 7: return "Seven";
//            case 8: return "Eight";
//            case 9: return "Nine";
//            default: return "ERROR";
//        }
//    }

    public static int reverse (int number){
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number *= -1;
        }

        int sum = 0;
        do {
            sum+= number % 10;
            sum *= 10;
            number /= 10;
        } while (number > 0);
        sum /= 10;

        return (isNegative) ? (sum * -1) : (sum);
    }

    public static int getDigitCount(int number){
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        do {
            number /= 10;
            sum++;
        } while (number > 0);

        return sum;
    }
}
