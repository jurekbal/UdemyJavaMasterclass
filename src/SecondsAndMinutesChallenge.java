public class SecondsAndMinutesChallenge {
// Challenge z lekcji 59.

    public static void main(String[] args) {
        System.out.println(getDurationString(132, 43));
        System.out.println(getDurationString(576));
        System.out.println(getDurationString(23,87));
        System.out.println(getDurationString(-7));
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        }
        int hours = minutes / 60;
        int minutesReminder = minutes % 60;
        return hours + "h " + minutesReminder + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int secondsReminder = seconds % 60;
        return getDurationString(minutes, secondsReminder);
    }
}
