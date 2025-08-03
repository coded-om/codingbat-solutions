public class TeenSum {

    public static int teenSum(int a, int b) {
        if (isTeen(a) || isTeen(b)) {
            return 19;
        }
        return a + b;
    }

    // Helper method must be inside the class
    private static boolean isTeen(int n) {
        return n >= 13 && n <= 19;
    }

    public static void main(String[] args) {
        System.out.println(teenSum(3, 4));    // → 7
        System.out.println(teenSum(10, 13));  // → 19
        System.out.println(teenSum(13, 2));   // → 19
    }
}

