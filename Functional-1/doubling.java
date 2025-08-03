import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoublingExample {

    // Method to return a list with each integer doubled
    public static List<Integer> doubling(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            result.add(num * 2);
        }
        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + doubling(Arrays.asList(1, 2, 3)));              // [2, 4, 6]
        System.out.println("Test 2: " + doubling(Arrays.asList(6, 8, 6, 8, -1)));       // [12, 16, 12, 16, -2]
        System.out.println("Test 3: " + doubling(new ArrayList<>()));                  // []
    }
}

