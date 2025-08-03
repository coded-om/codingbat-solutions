public class CaughtSpeeding {

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed -= 5;
        }

        if (speed <= 60) {
            return 0; // no ticket
        } else if (speed <= 80) {
            return 1; // small ticket
        } else {
            return 2; // big ticket
        }
    }

    public static void main(String[] args) {
        System.out.println(caughtSpeeding(60, false)); // → 0
        System.out.println(caughtSpeeding(65, false)); // → 1
        System.out.println(caughtSpeeding(65, true));  // → 0
        System.out.println(caughtSpeeding(85, true));  // → 1
        System.out.println(caughtSpeeding(90, false)); // → 2
    }
}

