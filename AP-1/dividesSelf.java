public class SelfDivider {
    public static boolean dividesSelf(int n) {
        int original = n;

        while (n > 0) {
            int digit = n % 10;
            if (digit == 0 || original % digit != 0) {
                return false;
            }
            n = n / 10;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(dividesSelf(128));  // true
        System.out.println(dividesSelf(12));   // true
        System.out.println(dividesSelf(120));  // false
    }
}

