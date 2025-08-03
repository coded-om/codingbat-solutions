import java.util.HashMap;
import java.util.Map;

public class PairsExample {

    // Method to map first char to last char for each string
    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> result = new HashMap<>();
        for (String str : strings) {
            String key = str.substring(0, 1);                         // First character
            String value = str.substring(str.length() - 1);          // Last character
            result.put(key, value);  // Later strings with the same key will overwrite
        }
        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        // Test case 1
        String[] input1 = {"code", "bug"};
        System.out.println("Test 1: " + pairs(input1));
        // Expected: {c=e, b=g}

        // Test case 2
        String[] input2 = {"man", "moon", "main"};
        System.out.println("Test 2: " + pairs(input2));
        // Expected: {m=n} (only the last "m" key is kept)

        // Test case 3
        String[] input3 = {"man", "moon", "good", "night"};
        System.out.println("Test 3: " + pairs(input3));
        // Expected: {m=n, g=d, n=t}
    }
}

