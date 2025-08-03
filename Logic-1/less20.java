public class Less20 {

    public static boolean less20(int n) {
        return (n % 20 == 18 || n % 20 == 19);
    }

    public static void main(String[] args) {
        System.out.println(less20(18));  // → true
        System.out.println(less20(19));  // → true
        System.out.println(less20(20));  // → false
        System.out.println(less20(38));  // → true
        System.out.println(less20(39));  // → true
        System.out.println(less20(40));  // → false
    }
}

