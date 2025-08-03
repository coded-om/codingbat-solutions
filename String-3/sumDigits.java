public class SumDigits {

    public int sumDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        SumDigits obj = new SumDigits();

        System.out.println(obj.sumDigits("aa1bc2d3"));    // → 6
        System.out.println(obj.sumDigits("aa11b33"));     // → 8
        System.out.println(obj.sumDigits("Chocolate"));   // → 0
    }
}

