public class PairStar {

    // Recursive method to insert '*' between identical adjacent characters
    public static String pairStar(String str) {
        if (str.length() <= 1) {
            return str; // base case
        }

        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        } else {
            return str.charAt(0) + pairStar(str.substring(1));
        }
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("pairStar(\"hello\") = " + pairStar("hello")); // "hel*lo"
        System.out.println("pairStar(\"xxyy\") = " + pairStar("x*xy*y")); // "x*xy*y"
        System.out.println("pairStar(\"aaaa\") = " + pairStar("a*a*a*a")); // "a*a*a*a"
    }
}

