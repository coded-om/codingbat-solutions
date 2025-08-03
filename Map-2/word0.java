import java.util.HashMap;
import java.util.Map;

public class Word0Example {

    // Method to create a map with keys from array and values set to 0
    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String str : strings) {
            result.put(str, 0);  // automatically handles uniqueness
        }
        return result;
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Test case 1
        String[] input1 = {"a", "b", "a", "b"};
        System.out.println("Test 1: " + word0(input1));
        // Expected: {a=0, b=0}

        // Test case 2
        String[] input2 = {"a", "b", "a", "c", "b"};
        System.out.println("Test 2: " + word0(input2));
        // Expected: {a=0, b=0, c=0}

        // Test case 3
        String[] input3 = {"c", "b", "a"};
        System.out.println("Test 3: " + word0(input3));
        // Expected: {a=0, b=0, c=0}
    }
}

