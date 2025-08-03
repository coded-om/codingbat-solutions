public class CountTriple {

    public int countTriple(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            char current = str.charAt(i);
            if (current == str.charAt(i + 1) && current == str.charAt(i + 2)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        CountTriple obj = new CountTriple();

        System.out.println(obj.countTriple("abcXXXabc"));      // → 1
        System.out.println(obj.countTriple("xxxabyyyycd"));    // → 3
        System.out.println(obj.countTriple("a"));              // → 0
        System.out.println(obj.countTriple("aaa"));            // → 1
        System.out.println(obj.countTriple("aaaa"));           // → 2
    }
}

