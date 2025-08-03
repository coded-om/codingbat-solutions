public class AlarmClock {

    public static String alarmClock(int day, boolean vacation) {
        boolean isWeekend = (day == 0 || day == 6); // 0=Sun, 6=Sat

        if (vacation) {
            if (isWeekend) {
                return "off";
            } else {
                return "10:00";
            }
        } else {
            if (isWeekend) {
                return "10:00";
            } else {
                return "7:00";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(alarmClock(1, false)); // → "7:00"
        System.out.println(alarmClock(5, false)); // → "7:00"
        System.out.println(alarmClock(0, false)); // → "10:00"
        System.out.println(alarmClock(0, true));  // → "off"
        System.out.println(alarmClock(2, true));  // → "10:00"
    }
}

