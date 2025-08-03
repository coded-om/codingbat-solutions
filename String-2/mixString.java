public class MixString {

    public String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int minLen = Math.min(a.length(), b.length());

        // Interleave characters from both strings
        for (int i = 0; i < minLen; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }

        // Append remaining characters from the longer string
        if (a.length() > b.length()) {
            result.append(a.substring(minLen));
        } else if (b.length() > a.length()) {
            result.append(b.substring(minLen));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        MixString obj = new MixString();

        System.out.println(obj.mixString("abc", "xyz"));     // → "axbycz"
        System.out.println(obj.mixString("Hi", "There"));    // → "HTihere"
        System.out.println(obj.mixString("xxxx", "There"));  // → "xTxhxexre"
    }
}

