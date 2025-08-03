public class RepeatEnd {
public String repeatEnd(String str, int n) {
String end = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(end);
        }

        return result.toString();
}

    public static void main(String[] args) {
        RepeatEnd obj = new RepeatEnd();

        System.out.println(obj.repeatEnd("Hello", 3)); // → "llollollo"
        System.out.println(obj.repeatEnd("Hello", 2)); // → "lolo"
        System.out.println(obj.repeatEnd("Hello", 1)); // → "o"
    }
}
