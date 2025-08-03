public class OneTwo {

    public String oneTwo(String str) {
        StringBuilder result = new StringBuilder();
        
        // Process each group of 3 characters
        for (int i = 0; i + 2 < str.length(); i += 3) {
            // Rearrange as described: move first char after the next two
            result.append(str.charAt(i + 1)); // 2nd char
            result.append(str.charAt(i + 2)); // 3rd char
            result.append(str.charAt(i));     // 1st char
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        OneTwo obj = new OneTwo();

        System.out.println(obj.oneTwo("abc"));       // → "bca"
        System.out.println(obj.oneTwo("tca"));       // → "cat"
        System.out.println(obj.oneTwo("tcagdo"));    // → "catdog"
        System.out.println(obj.oneTwo("abcdefg"));   // → "bcaefd"
    }
}

