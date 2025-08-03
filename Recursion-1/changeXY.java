public class ChangeXY {

    // Recursive method to replace 'x' with 'y'
    public static String changeXY(String str) {
        if (str.length() == 0) {
            return ""; // base case
        }
        char first = str.charAt(0);
        if (first == 'x') {
            return 'y' + changeXY(str.substring(1));
        } else {
            return first + changeXY(str.substring(1));
        }
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("changeXY(\"codex\") = " + changeXY("codex"));       // "codey"
        System.out.println("changeXY(\"xxhixx\") = " + changeXY("xxhixx"));     // "yyhiyy"
        System.out.println("changeXY(\"xhixhix\") = " + changeXY("xhixhix"));   // "yhiyhiy"
    }
}

