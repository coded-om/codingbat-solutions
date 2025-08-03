public class FizzArray2 {

    public static String[] fizzArray2(int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = String.valueOf(i);
        }
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        int[] testInputs = {4, 10, 2, 0};

        for (int n : testInputs) {
            System.out.print("fizzArray2(" + n + ") → [");
            String[] result = fizzArray2(n);
            for (int i = 0; i < result.length; i++) {
                System.out.print("\"" + result[i] + "\"");
                if (i < result.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}

