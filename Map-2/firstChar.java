import java.util.HashMap;
import java.util.Map;

public class FirstCharExample {

    // Method to group strings by their first character
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String str : strings) {
            String key = str.substring(0, 1);  // Get first character as key

            if (result.containsKey(key)) {
                result.put(key, result.get(key) + str);  // Append
            } else {
                result.put(key, str);  // First occurrence
            }
        }

        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        // Test case 1
        String[] input1 = {"salt", "tea", "soda", "toast"};
        System.out.println("Test 1: " + firstChar(input1));
        // Expected: {s=saltsoda, t=teatoast}

        // Test case 2
        String[] input2 = {"aa", "bb", "cc", "aAA", "cCC", "d"};
        System.out.println("Test 2: " + firstChar(input2));
        // Expected: {a=aaaAA, b=bb, c=cccCC, d=d}

        // Test case 3
        String[] input3 = {};
        System.out.println("Test 3: " + firstChar(input3));
        // Expected: {}
    }
}

