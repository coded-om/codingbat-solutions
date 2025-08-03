public class SumNumbers {

    public int sumNumbers(String str) {
        int sum = 0;
        String num = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                num += ch;
            } else {
                if (!num.isEmpty()) {
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }

        // In case the string ends with a number
        if (!num.isEmpty()) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }

    public static void main(String[] args) {
        SumNumbers obj = new SumNumbers();

        System.out.println(obj.sumNumbers("abc123xyz")); // → 123
        System.out.println(obj.sumNumbers("aa11b33"));   // → 44
        System.out.println(obj.sumNumbers("7 11"));      // → 18
        System.out.println(obj.sumNumbers("no digits")); // → 0
        System.out.println(obj.sumNumbers("a1b2c3"));    // → 6
    }
}

