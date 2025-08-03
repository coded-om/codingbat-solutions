public class StringClean {

    // Recursive method to remove adjacent duplicate characters
    public static String stringClean(String str) {
        if (str.length() < 2) {
            return str; // base case
        }

        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1)); // skip duplicate
        } else {
            return str.charAt(0) + stringClean(str.substring(1)); // keep char
        }
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("stringClean(\"yyzzza\") = " + stringClean("yyzzza"));     // "yza"
        System.out.println("stringClean(\"abbbcdd\") = " + stringClean("abbbcdd"));   // "abcd"
        System.out.println("stringClean(\"Hello\") = " + stringClean("Hello"));       // "Helo"
    }
}

