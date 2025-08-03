public class LessBy10 {

    public static boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a - b) >= 10) ||
               (Math.abs(a - c) >= 10) ||
               (Math.abs(b - c) >= 10);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(lessBy10(1, 7, 11)); // true
        System.out.println(lessBy10(1, 7, 10)); // false
        System.out.println(lessBy10(11, 1, 7)); // true
        System.out.println(lessBy10(10, 10, 21)); // true
        System.out.println(lessBy10(5, 3, 2)); // false
    }
}

