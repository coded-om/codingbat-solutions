public class RepeatFront {

    public String repeatFront(String str, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = n; i > 0; i--) {
            result.append(str.substring(0, i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        RepeatFront obj = new RepeatFront();

        System.out.println(obj.repeatFront("Chocolate", 4)); // → "ChocChoChC"
        System.out.println(obj.repeatFront("Chocolate", 3)); // → "ChoChC"
        System.out.println(obj.repeatFront("Ice Cream", 2)); // → "IcI"
    }
}

