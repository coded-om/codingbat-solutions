public class DigitChecker {
    public static boolean hasOne(int n) {
        while (n > 0) {
            if (n % 10 == 1) {
                return true;
            }
            n = n / 10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasOne(10));   // true
        System.out.println(hasOne(22));   // false
        System.out.println(hasOne(220));  // false
    }
}

