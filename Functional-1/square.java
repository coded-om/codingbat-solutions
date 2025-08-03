import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareExample {

    // Method to return a list where each integer is squared
    public static List<Integer> square(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            result.add(num * num);
        }
        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + square(Arrays.asList(1, 2, 3)));               // [1, 4, 9]
        System.out.println("Test 2: " + square(Arrays.asList(6, 8, -6, -8, 1)));       // [36, 64, 36, 64, 1]
        System.out.println("Test 3: " + square(new ArrayList<>()));                   // []
    }
}

