public class BunnyEars2 {

    // Recursive method to count ears based on even/odd bunny number
    public static int bunnyEars2(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 2 == 0) {
            return 3 + bunnyEars2(n - 1); // Even-numbered bunny
        } else {
            return 2 + bunnyEars2(n - 1); // Odd-numbered bunny
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println("bunnyEars2(0) = " + bunnyEars2(0)); // → 0
        System.out.println("bunnyEars2(1) = " + bunnyEars2(1)); // → 2
        System.out.println("bunnyEars2(2) = " + bunnyEars2(2)); // → 5
        System.out.println("bunnyEars2(3) = " + bunnyEars2(3)); // → 7
        System.out.println("bunnyEars2(4) = " + bunnyEars2(4)); // → 10
        System.out.println("bunnyEars2(5) = " + bunnyEars2(5)); // → 12
    }
}

