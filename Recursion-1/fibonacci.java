public class FibonacciRecursive {

    // Recursive method to compute nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) return 0;           // base case 1
        if (n == 1) return 1;           // base case 2
        return fibonacci(n - 1) + fibonacci(n - 2);  // recursive step
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("fibonacci(0) = " + fibonacci(0)); // 0
        System.out.println("fibonacci(1) = " + fibonacci(1)); // 1
        System.out.println("fibonacci(2) = " + fibonacci(2)); // 1
        System.out.println("fibonacci(5) = " + fibonacci(5)); // 5
        System.out.println("fibonacci(7) = " + fibonacci(7)); // 13
    }
}

