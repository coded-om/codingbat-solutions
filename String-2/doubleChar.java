public class DoubleChar {

    public String doubleChar(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.append(ch).append(ch);  // Append char twice
        }

        return result.toString();
    }

    public static void main(String[] args) {
        DoubleChar obj = new DoubleChar();

        System.out.println(obj.doubleChar("The"));       // → "TThhee"
        System.out.println(obj.doubleChar("AAbb"));      // → "AAAAbbbb"
        System.out.println(obj.doubleChar("Hi-There"));  // → "HHii--TThheerree"
    }
}

