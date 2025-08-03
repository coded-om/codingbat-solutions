public class SumDigits {

    // Recursive method to sum digits of a non-negative integer
    public static int sumDigits(int n) {
        if (n == 0) {
            return 0; // base case
        }
        return (n % 10) + sumDigits(n / 10); // recursive step
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("sumDigits(126) = " + sumDigits(126)); // 9
        System.out.println("sumDigits(49) = " + sumDigits(49));   // 13
        System.out.println("sumDigits(12) = " + sumDigits(12));   // 3
        System.out.println("sumDigits(0) = " + sumDigits(0));     // 0
    }
}

