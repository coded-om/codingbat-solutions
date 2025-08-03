public class StrCopies {

    // Recursive method to check if at least n copies of sub appear in str (allowing overlap)
    public static boolean strCopies(String str, String sub, int n) {
        if (n == 0) {
            return true; // base case: found enough
        }
        if (str.length() < sub.length()) {
            return false; // base case: not enough space
        }

        if (str.startsWith(sub)) {
            return strCopies(str.substring(1), sub, n - 1);
        } else {
            return strCopies(str.substring(1), sub, n);
        }
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("strCopies(\"catcowcat\", \"cat\", 2) = " + strCopies("catcowcat", "cat", 2)); // true
        System.out.println("strCopies(\"catcowcat\", \"cow\", 2) = " + strCopies("catcowcat", "cow", 2)); // false
        System.out.println("strCopies(\"catcowcat\", \"cow\", 1) = " + strCopies("catcowcat", "cow", 1)); // true
    }
}

