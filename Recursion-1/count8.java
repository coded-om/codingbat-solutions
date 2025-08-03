public class Count8 {

    // Recursive method to count 8s with double-counting rule
    public static int count8(int n) {
        if (n == 0) {
            return 0; // base case
        }

        int lastDigit = n % 10;
        int nextDigit = (n / 10) % 10;

        if (lastDigit == 8) {
            if (nextDigit == 8) {
                return 2 + count8(n / 10); // double count
            } else {
                return 1 + count8(n / 10);
            }
        } else {
            return count8(n / 10);
        }
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("count8(8) = " + count8(8));         // 1
        System.out.println("count8(818) = " + count8(818));     // 2
        System.out.println("count8(8818) = " + count8(8818));   // 4
        System.out.println("count8(888) = " + count8(888));     // 5
        System.out.println("count8(123) = " + count8(123));     // 0
    }
}

