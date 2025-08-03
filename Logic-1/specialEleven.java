public class SpecialEleven {

    public static boolean specialEleven(int n) {
        return (n % 11 == 0) || (n % 11 == 1);
    }

    public static void main(String[] args) {
        System.out.println(specialEleven(22)); // → true
        System.out.println(specialEleven(23)); // → true
        System.out.println(specialEleven(24)); // → false
        System.out.println(specialEleven(0));  // → true
        System.out.println(specialEleven(1));  // → true
    }
}

