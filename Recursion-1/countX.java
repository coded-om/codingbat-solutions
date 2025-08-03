public class CountX {

    // Recursive method to count 'x' characters
    public static int countX(String str) {
        if (str.length() == 0) {
            return 0; // base case
        }
        if (str.charAt(0) == 'x') {
            return 1 + countX(str.substring(1));
        } else {
            return countX(str.substring(1));
        }
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("countX(\"xxhixx\") = " + countX("xxhixx"));     // 4
        System.out.println("countX(\"xhixhix\") = " + countX("xhixhix"));   // 3
        System.out.println("countX(\"hi\") = " + countX("hi"));             // 0
    }
}

