public class PowerN {

    // Recursive method to compute base raised to the power n
    public static int powerN(int base, int n) {
        if (n == 1) {
            return base; // base case
        }
        return base * powerN(base, n - 1); // recursive step
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("powerN(3, 1) = " + powerN(3, 1)); // 3
        System.out.println("powerN(3, 2) = " + powerN(3, 2)); // 9
        System.out.println("powerN(3, 3) = " + powerN(3, 3)); // 27
        System.out.println("powerN(2, 4) = " + powerN(2, 4)); // 16
    }
}

