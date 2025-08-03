public class WithoutString {

    public String withoutString(String base, String remove) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int lenRemove = remove.length();
        String baseLower = base.toLowerCase();
        String removeLower = remove.toLowerCase();

        while (i < base.length()) {
            if (i + lenRemove <= base.length() &&
                baseLower.substring(i, i + lenRemove).equals(removeLower)) {
                i += lenRemove; // skip over the "remove" substring
            } else {
                result.append(base.charAt(i));
                i++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        WithoutString obj = new WithoutString();

        System.out.println(obj.withoutString("Hello there", "llo"));   // → "He there"
        System.out.println(obj.withoutString("Hello there", "e"));     // → "Hllo thr"
        System.out.println(obj.withoutString("Hello there", "x"));     // → "Hello there"
        System.out.println(obj.withoutString("xxx", "xx"));            // → "x"
    }
}

