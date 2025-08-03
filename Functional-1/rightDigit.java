import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RightDigitExample {

    // Method to return the list of rightmost digits
    public static List<Integer> rightDigit(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            result.add(num % 10);
        }
        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + rightDigit(Arrays.asList(1, 22, 93)));          // [1, 2, 3]
        System.out.println("Test 2: " + rightDigit(Arrays.asList(16, 8, 886, 8, 1)));   // [6, 8, 6, 8, 1]
        System.out.println("Test 3: " + rightDigit(Arrays.asList(10, 0)));             // [0, 0]
    }
}

