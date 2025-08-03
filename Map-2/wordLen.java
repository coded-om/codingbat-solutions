import java.util.HashMap;
import java.util.Map;

public class WordLenExample {

    // Method to create a map where each string maps to its length
    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String str : strings) {
            result.put(str, str.length());  // overwriting is fine; value is always the same
        }
        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        // Test case 1
        String[] input1 = {"a", "bb", "a", "bb"};
        System.out.println("Test 1: " + wordLen(input1));
        // Expected: {a=1, bb=2}

        // Test case 2
        String[] input2 = {"this", "and", "that", "and"};
        System.out.println("Test 2: " + wordLen(input2));
        // Expected: {this=4, and=3, that=4}

        // Test case 3
        String[] input3 = {"code", "code", "code", "bug"};
        System.out.println("Test 3: " + wordLen(input3));
        // Expected: {code=4, bug=3}
    }
}

