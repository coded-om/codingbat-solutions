public class Count11 {

    // Recursive method to count non-overlapping "11" substrings
    public static int count11(String str) {
        if (str.length() < 2) {
            return 0; // base case
        }

        if (str.startsWith("11")) {
            return 1 + count11(str.substring(2)); // skip next to avoid overlap
        } else {
            return count11(str.substring(1));
        }
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("count11(\"11abc11\") = " + count11("11abc11"));         // 2
        System.out.println("count11(\"abc11x11x11\") = " + count11("abc11x11x11")); // 3
        System.out.println("count11(\"111\") = " + count11("111"));                 // 1
    }
}

