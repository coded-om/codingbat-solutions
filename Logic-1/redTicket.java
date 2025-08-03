public class RedTicket {

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (b != a && c != a) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(redTicket(2, 2, 2)); // → 10
        System.out.println(redTicket(2, 2, 1)); // → 0
        System.out.println(redTicket(0, 0, 0)); // → 5
        System.out.println(redTicket(1, 2, 0)); // → 1
        System.out.println(redTicket(1, 1, 0)); // → 0
    }
}

