public class Count7 {

    // Recursive method to count 7s in an integer
    public static int count7(int n) {
        if (n == 0) {
            return 0; // base case
        }
        if (n % 10 == 7) {
            return 1 + count7(n / 10);
        } else {
            return count7(n / 10);
        }
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("count7(717) = " + count7(717)); // 2
        System.out.println("count7(7) = " + count7(7));     // 1
        System.out.println("count7(123) = " + count7(123)); // 0
        System.out.println("count7(77777) = " + count7(77777)); // 5
    }
}

