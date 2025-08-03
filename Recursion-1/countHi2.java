public class CountHi2 {

    // Recursive method to count "hi" not preceded by 'x'
    public static int countHi2(String str) {
        if (str.length() < 2) {
            return 0; // base case
        }

        if (str.length() >= 3 && str.startsWith("xhi")) {
            return countHi2(str.substring(3)); // skip "xhi"
        } else if (str.startsWith("hi")) {
            return 1 + countHi2(str.substring(2)); // count "hi"
        } else {
            return countHi2(str.substring(1)); // move ahead
        }
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("countHi2(\"ahixhi\") = " + countHi2("ahixhi"));   // 1
        System.out.println("countHi2(\"ahibhi\") = " + countHi2("ahibhi"));   // 2
        System.out.println("countHi2(\"xhixhi\") = " + countHi2("xhixhi"));   // 0
    }
}

