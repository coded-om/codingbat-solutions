import java.util.HashMap;
import java.util.Map;

public class WordAppendExample {

    // Method to build result from every 2nd, 4th, 6th, etc. appearance of a word
    public static String wordAppend(String[] strings) {
        Map<String, Integer> countMap = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (String str : strings) {
            int count = countMap.getOrDefault(str, 0) + 1;
            countMap.put(str, count);

            // Append to result if count is even
            if (count % 2 == 0) {
                result.append(str);
            }
        }

        return result.toString();
    }

    // Main method with test cases
    public static void main(String[] args) {
        // Test case 1
        String[] input1 = {"a", "b", "a"};
        System.out.println("Test 1: " + wordAppend(input1));  // Expected: "a"

        // Test case 2
        String[] input2 = {"a", "b", "a", "c", "a", "d", "a"};
        System.out.println("Test 2: " + wordAppend(input2));  // Expected: "aa"

        // Test case 3
        String[] input3 = {"a", "", "a"};
        System.out.println("Test 3: " + wordAppend(input3));  // Expected: "a"
    }
}

