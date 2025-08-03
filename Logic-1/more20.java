public class More20 {

    public static boolean more20(int n) {
        return (n % 20 == 1) || (n % 20 == 2);
    }

    public static void main(String[] args) {
        System.out.println(more20(20)); // → false
        System.out.println(more20(21)); // → true
        System.out.println(more20(22)); // → true
        System.out.println(more20(23)); // → false
        System.out.println(more20(0));  // → false
    }
}

