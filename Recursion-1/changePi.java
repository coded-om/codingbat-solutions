public class ChangePi {

    // Recursive method to replace "pi" with "3.14"
    public static String changePi(String str) {
        if (str.length() < 2) {
            return str; // base case
        }

        if (str.startsWith("pi")) {
            return "3.14" + changePi(str.substring(2));
        } else {
            return str.charAt(0) + changePi(str.substring(1));
        }
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("changePi(\"xpix\") = " + changePi("xpix"));     // "x3.14x"
        System.out.println("changePi(\"pipi\") = " + changePi("pipi"));     // "3.143.14"
        System.out.println("changePi(\"pip\") = " + changePi("pip"));       // "3.14p"
    }
}

