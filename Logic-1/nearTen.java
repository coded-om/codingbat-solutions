public class NearTen {

    public static boolean nearTen(int num) {
        int remainder = num % 10;
        return remainder <= 2 || remainder >= 8;
    }

    public static void main(String[] args) {
        System.out.println(nearTen(12)); // → true
        System.out.println(nearTen(17)); // → false
        System.out.println(nearTen(19)); // → true
        System.out.println(nearTen(20)); // → true
        System.out.println(nearTen(22)); // → true
        System.out.println(nearTen(23)); // → false
    }
}

