public class BunnyEars {

    // Recursive method to compute total ears
    public static int bunnyEars(int n) {
        if (n == 0) {
            return 0; // base case
        }
        return 2 + bunnyEars(n - 1); // recursive case
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("bunnyEars(0) = " + bunnyEars(0)); // 0
        System.out.println("bunnyEars(1) = " + bunnyEars(1)); // 2
        System.out.println("bunnyEars(2) = " + bunnyEars(2)); // 4
        System.out.println("bunnyEars(5) = " + bunnyEars(5)); // 10
    }
}

