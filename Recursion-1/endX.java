public class EndX {

    // Recursive method to move all 'x' characters to the end
    public static String endX(String str) {
        if (str.length() <= 1) {
            return str; // base case
        }

        char first = str.charAt(0);
        if (first == 'x') {
            return endX(str.substring(1)) + 'x'; // move 'x' to end
        } else {
            return first + endX(str.substring(1)); // keep character
        }
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("endX(\"xxre\") = " + endX("xxre"));       // "rexx"
        System.out.println("endX(\"xxhixx\") = " + endX("xxhixx"));   // "hixxxx"
        System.out.println("endX(\"xhixhix\") = " + endX("xhixhix")); // "hihixxx"
    }
}

