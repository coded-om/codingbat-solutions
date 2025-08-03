import java.util.HashMap;
import java.util.Map;

public class WordMultipleExample {

    // Method to mark if a word appears 2 or more times
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> countMap = new HashMap<>();
        Map<String, Boolean> result = new HashMap<>();

        for (String str : strings) {
            int count = countMap.getOrDefault(str, 0) + 1;
            countMap.put(str, count);
            result.put(str, count >= 2);
        }

        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        // Test case 1
        String[] input1 = {"a", "b", "a", "c", "b"};
        System.out.println("Test 1: " + wordMultiple(input1));
        // Expected: {a=true, b=true, c=false}

        // Test case 2
        String[] input2 = {"c", "b", "a"};
        System.out.println("Test 2: " + wordMultiple(input2));
        // Expected: {a=false, b=false, c=false}

        // Test case 3
        String[] input3 = {"c", "c", "c", "c"};
        System.out.println("Test 3: " + wordMultiple(input3));
        // Expected: {c=true}
    }
}

