public class NestParen {

    // Recursive method to check for valid nested parentheses
    public static boolean nestParen(String str) {
        if (str.isEmpty()) {
            return true; // base case: empty string is valid
        }

        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            return nestParen(str.substring(1, str.length() - 1));
        }

        return false; // invalid pattern
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("nestParen(\"(())\") = " + nestParen("(())"));       // true
        System.out.println("nestParen(\"((()))\") = " + nestParen("((()))"));   // true
        System.out.println("nestParen(\"(((x))\") = " + nestParen("(((x))"));   // false
        System.out.println("nestParen(\"()()\") = " + nestParen("()()"));       // false
        System.out.println("nestParen(\"\") = " + nestParen(""));               // true
    }
}

