public class FactorialRecursive {

    // Recursive method to compute factorial
    public static int factorial(int n) {
        if (n == 1) {
            return 1; // Base case
        }
        return n * factorial(n - 1); // Recursive step
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("factorial(1) = " + factorial(1)); // 1
        System.out.println("factorial(2) = " + factorial(2)); // 2
        System.out.println("factorial(3) = " + factorial(3)); // 6
        System.out.println("factorial(5) = " + factorial(5)); // 120
    }
}

