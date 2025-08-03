public class MaxMod5 {

    public static int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a % 5 == b % 5) {
            return Math.min(a, b);
        } else {
            return Math.max(a, b);
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(maxMod5(2, 3)); // → 3
        System.out.println(maxMod5(6, 2)); // → 6
        System.out.println(maxMod5(3, 2)); // → 3
        System.out.println(maxMod5(7, 2)); // → 7
        System.out.println(maxMod5(5, 10)); // → 5
        System.out.println(maxMod5(6, 6)); // → 0
    }
}

