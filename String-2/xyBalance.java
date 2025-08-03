public class XYBalance {

    public boolean xyBalance(String str) {
        boolean foundY = false;

        // Scan the string from end to start
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == 'y') {
                foundY = true; // Mark that a 'y' has been found
            } else if (str.charAt(i) == 'x' && !foundY) {
                return false; // Found an 'x' with no 'y' after it
            }
        }

        return true;
    }

    public static void main(String[] args) {
        XYBalance obj = new XYBalance();

        System.out.println(obj.xyBalance("aaxbby"));  // → true
        System.out.println(obj.xyBalance("aaxbb"));   // → false
        System.out.println(obj.xyBalance("yaaxbb"));  // → false
        System.out.println(obj.xyBalance("x"));       // → false
        System.out.println(obj.xyBalance("y"));       // → true
    }
}

