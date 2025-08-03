public class TwoAsOne {

    public static boolean twoAsOne(int a, int b, int c) {
        return (a + b == c) || (a + c == b) || (b + c == a);
    }

    public static void main(String[] args) {
        System.out.println(twoAsOne(1, 2, 3)); // → true
        System.out.println(twoAsOne(3, 1, 2)); // → true
        System.out.println(twoAsOne(3, 2, 2)); // → false
    }
}

