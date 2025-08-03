public class LastDigitTest {

    public static boolean lastDigit(int a, int b, int c) {
        int aLast = a % 10;
        int bLast = b % 10;
        int cLast = c % 10;

        return (aLast == bLast) || (aLast == cLast) || (bLast == cLast);
    }

    public static void main(String[] args) {
        // Sample test cases
        System.out.println(lastDigit(23, 19, 13)); // true
        System.out.println(lastDigit(23, 19, 12)); // false
        System.out.println(lastDigit(23, 19, 3));  // true
        System.out.println(lastDigit(7, 17, 27));  // true
        System.out.println(lastDigit(10, 20, 30)); // true
        System.out.println(lastDigit(1, 2, 3));    // false
    }
}

