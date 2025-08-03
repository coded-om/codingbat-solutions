public class InOrderTest {

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return c > b;
        } else {
            return b > a && c > b;
        }
    }

    public static void main(String[] args) {
        // Sample test cases
        System.out.println(inOrder(1, 2, 4, false)); // true
        System.out.println(inOrder(1, 2, 1, false)); // false
        System.out.println(inOrder(1, 1, 2, true));  // true
        System.out.println(inOrder(3, 2, 4, true));  // true
        System.out.println(inOrder(3, 2, 2, false)); // false
    }
}

