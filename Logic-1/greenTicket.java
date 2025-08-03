public class GreenTicket {

    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || b == c || a == c) {
            return 10;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(greenTicket(1, 2, 3)); // → 0
        System.out.println(greenTicket(2, 2, 2)); // → 20
        System.out.println(greenTicket(1, 1, 2)); // → 10
        System.out.println(greenTicket(3, 2, 3)); // → 10
    }
}

