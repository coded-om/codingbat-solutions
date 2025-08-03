public class Old35 {

    public static boolean old35(int n) {
        return (n % 3 == 0) ^ (n % 5 == 0); // XOR: true if only one condition is true
    }

    public static void main(String[] args) {
        System.out.println(old35(3));   // → true
        System.out.println(old35(10));  // → true
        System.out.println(old35(15));  // → false
        System.out.println(old35(9));   // → true
        System.out.println(old35(5));   // → true
        System.out.println(old35(30));  // → false
    }
}

