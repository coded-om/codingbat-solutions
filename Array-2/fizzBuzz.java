public class FizzBuzz {

    public static String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start];

        for (int i = start; i < end; i++) {
            if (i % 15 == 0) {
                result[i - start] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i - start] = "Fizz";
            } else if (i % 5 == 0) {
                result[i - start] = "Buzz";
            } else {
                result[i - start] = String.valueOf(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(java.util.Arrays.toString(fizzBuzz(1, 6)));   // ["1", "2", "Fizz", "4", "Buzz"]
        System.out.println(java.util.Arrays.toString(fizzBuzz(1, 8)));   // ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
        System.out.println(java.util.Arrays.toString(fizzBuzz(1, 11)));  // ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
    }
}

