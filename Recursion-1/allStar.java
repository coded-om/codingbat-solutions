public class AllStar {

    // Recursive method to insert '*' between adjacent characters
    public static String allStar(String str) {
        if (str.length() <= 1) {
            return str; // base case
        }

        return str.charAt(0) + "*" + allStar(str.substring(1));
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("allStar(\"hello\") = " + allStar("hello")); // "h*e*l*l*o"
        System.out.println("allStar(\"abc\") = " + allStar("abc"));     // "a*b*c"
        System.out.println("allStar(\"ab\") = " + allStar("ab"));       // "a*b"
    }
}

