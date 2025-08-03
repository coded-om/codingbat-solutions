public class ShareDigit {

    public static boolean shareDigit(int a, int b) {
        int aLeft = a / 10;
        int aRight = a % 10;
        int bLeft = b / 10;
        int bRight = b % 10;

        return (aLeft == bLeft || aLeft == bRight || aRight == bLeft || aRight == bRight);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(shareDigit(12, 23)); // → true
        System.out.println(shareDigit(12, 43)); // → false
        System.out.println(shareDigit(12, 44)); // → false
        System.out.println(shareDigit(19, 91)); // → true
        System.out.println(shareDigit(55, 59)); // → true
    }
}

