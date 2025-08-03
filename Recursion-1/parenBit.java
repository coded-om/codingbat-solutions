public class ParenBit {

    // Recursive method to extract the first balanced "(...)"
    public static String parenBit(String str) {
        if (str.charAt(0) != '(') {
            return parenBit(str.substring(1));
        } else if (str.charAt(str.length() - 1) != ')') {
            return parenBit(str.substring(0, str.length() - 1));
        } else {
            return str;
        }
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("parenBit(\"xyz(abc)123\") = " + parenBit("xyz(abc)123")); // "(abc)"
        System.out.println("parenBit(\"x(hello)\") = " + parenBit("x(hello)"));       // "(hello)"
        System.out.println("parenBit(\"(xy)1\") = " + parenBit("(xy)1"));             // "(xy)"
    }
}

