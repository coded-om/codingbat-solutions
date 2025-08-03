import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Math1Example {

    // Method to apply (n + 1) * 10 transformation to each integer
    public static List<Integer> math1(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            result.add((num + 1) * 10);
        }
        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + math1(Arrays.asList(1, 2, 3)));             // [20, 30, 40]
        System.out.println("Test 2: " + math1(Arrays.asList(6, 8, 6, 8, 1)));       // [70, 90, 70, 90, 20]
        System.out.println("Test 3: " + math1(Arrays.asList(10)));                 // [110]
    }
}

