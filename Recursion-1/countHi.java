public class CountHi {

    // Recursive method to count "hi" substrings
    public static int countHi(String str) {
        if (str.length() < 2) {
            return 0; // base case
        }
        if (str.startsWith("hi")) {
            return 1 + countHi(str.substring(2)); // count and skip "hi"
        } else {
            return countHi(str.substring(1)); // skip one char
        }
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("countHi(\"xxhixx\") = " + countHi("xxhixx"));     // 1
        System.out.println("countHi(\"xhixhix\") = " + countHi("xhixhix"));   // 2
        System.out.println("countHi(\"hi\") = " + countHi("hi"));             // 1
        System.out.println("countHi(\"hihi\") = " + countHi("hihi"));         // 2
    }
}

