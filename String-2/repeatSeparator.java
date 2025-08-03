public class RepeatSeparator {

    public String repeatSeparator(String word, String sep, int count) {
        if (count <= 0) return "";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            result.append(word);
            if (i < count - 1) {
                result.append(sep);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        RepeatSeparator obj = new RepeatSeparator();

        System.out.println(obj.repeatSeparator("Word", "X", 3));   // → "WordXWordXWord"
        System.out.println(obj.repeatSeparator("This", "And", 2)); // → "ThisAndThis"
        System.out.println(obj.repeatSeparator("This", "And", 1)); // → "This"
    }
}

