package sekcja5;

public class SwitchChallengeL62 {

    public static void main(String[] args) {

        char znak = 'C';

        switch (znak) {
            case 'A': case 'B': case 'C': case 'D': case 'E': {
                System.out.println("Is A, B, C, D or E. Actually " + znak + " was found.");
                break;
            }
            default: {
                System.out.println("Neither A, B ,C, D , or E");
                break;
            }
        }

        // Od Javy 8 można używać Stringów w instrukcji 'switch'
        String month = "Styczeń";
        switch(month.toLowerCase()) {
            case "styczeń":
                System.out.println("sty");
                break;
            case "kwiecień":
                System.out.println();
                break;
            default:
                System.out.println("Nie jestem pewien.");
//                break;
        }
        // break na końcu np. po default jest opcjonalny;
        // można nie używać bloków w switchu {}
    }
}
