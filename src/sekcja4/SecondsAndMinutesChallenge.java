package sekcja4;

public class SecondsAndMinutesChallenge {
// Challenge z lekcji 59. + bonus z lekcji 60.

    //extra bonus: stała
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(132, 43));
        System.out.println(getDurationString(576));
        System.out.println(getDurationString(605));
        System.out.println(getDurationString(23,87));
        System.out.println(getDurationString(-7));
    }

    public static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long minutesReminder = minutes % 60;

        // Bonus part
        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }
        String minutesString = minutesReminder + "m";
        if (minutesReminder < 10) {
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString + "";
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60L;
        long secondsReminder = seconds % 60L;
        return getDurationString(minutes, secondsReminder);
    }
}
