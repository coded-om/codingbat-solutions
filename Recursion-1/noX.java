public class NoX {

    // Recursive method to remove all 'x' characters
    public static String noX(String str) {
        if (str.length() == 0) {
            return ""; // base case
        }

        char first = str.charAt(0);
        if (first == 'x') {
            return noX(str.substring(1)); // skip 'x'
        } else {
            return first + noX(str.substring(1)); // keep character
        }
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("noX(\"xaxb\") = " + noX("xaxb"));   // "ab"
        System.out.println("noX(\"abc\") = " + noX("abc"));     // "abc"
        System.out.println("noX(\"xx\") = " + noX("xx"));       // ""
    }
}

