import java.util.HashMap;
import java.util.Map;

public class WordCountExample {

    // Method to count the frequency of each word
    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String str : strings) {
            // If the word is already in the map, increment its count
            if (countMap.containsKey(str)) {
                countMap.put(str, countMap.get(str) + 1);
            } else {
                countMap.put(str, 1);
            }
        }
        return countMap;
    }

    // Main method with test cases
    public static void main(String[] args) {
        // Test case 1
        String[] input1 = {"a", "b", "a", "c", "b"};
        System.out.println("Test 1: " + wordCount(input1));
        // Expected: {a=2, b=2, c=1}

        // Test case 2
        String[] input2 = {"c", "b", "a"};
        System.out.println("Test 2: " + wordCount(input2));
        // Expected: {a=1, b=1, c=1}

        // Test case 3
        String[] input3 = {"c", "c", "c", "c"};
        System.out.println("Test 3: " + wordCount(input3));
        // Expected: {c=4}
    }
}

