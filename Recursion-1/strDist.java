public class StrDist {

    // Recursive method to compute length of largest substring starting and ending with sub
    public static int strDist(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0; // base case
        }

        if (str.startsWith(sub) && str.endsWith(sub)) {
            return str.length();
        }

        if (!str.startsWith(sub)) {
            return strDist(str.substring(1), sub); // trim from front
        }

        return strDist(str.substring(0, str.length() - 1), sub); // trim from back
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("strDist(\"catcowcat\", \"cat\") = " + strDist("catcowcat", "cat"));       // 9
        System.out.println("strDist(\"catcowcat\", \"cow\") = " + strDist("catcowcat", "cow"));       // 3
        System.out.println("strDist(\"cccatcowcatxx\", \"cat\") = " + strDist("cccatcowcatxx", "cat"));// 9
        System.out.println("strDist(\"hiHellohihihi\", \"hi\") = " + strDist("hiHellohihihi", "hi")); // 13
    }
}

