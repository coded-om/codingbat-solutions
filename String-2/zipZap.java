public class ZipZap {

    public String zipZap(String str) {
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < str.length()) {
            // Check for "z?p" pattern of length 3
            if (i + 2 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result.append("zp");  // skip the middle character
                i += 3;  // move past the 3-char pattern
            } else {
                result.append(str.charAt(i));
                i++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ZipZap obj = new ZipZap();

        System.out.println(obj.zipZap("zipXzap"));     // → "zpXzp"
        System.out.println(obj.zipZap("zopzop"));      // → "zpzp"
        System.out.println(obj.zipZap("zzzopzop"));    // → "zzzpzp"
    }
}

