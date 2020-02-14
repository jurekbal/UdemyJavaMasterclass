package sekcja4;

public class MegaBytesConverter {
// Cwiczenie z kodowania 2: MegaBytes Converter

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + kiloBytes / 1024 + " MB and " + kiloBytes % 1024 + " KB");
        }
    }
}
