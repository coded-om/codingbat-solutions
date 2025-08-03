public class PrefixAgain {

    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        // Start searching after the prefix itself
        return str.indexOf(prefix, n) != -1;
    }

    public static void main(String[] args) {
        PrefixAgain obj = new PrefixAgain();

        System.out.println(obj.prefixAgain("abXYabc", 1)); // → true
        System.out.println(obj.prefixAgain("abXYabc", 2)); // → true
        System.out.println(obj.prefixAgain("abXYabc", 3)); // → false
    }
}

