public class InOrderEqualTest {

    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            return a <= b && b <= c;
        } else {
            return a < b && b < c;
        }
    }

    public static void main(String[] args) {
        // Sample test cases
        System.out.println(inOrderEqual(2, 5, 11, false)); // true
        System.out.println(inOrderEqual(5, 7, 6, false));  // false
        System.out.println(inOrderEqual(5, 5, 7, true));   // true
        System.out.println(inOrderEqual(5, 5, 5, true));   // true
        System.out.println(inOrderEqual(5, 5, 5, false));  // false
    }
}

