import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AllSwapExample {

    public static String[] allSwap(String[] strings) {
        Map<Character, Integer> firstIndexMap = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            char key = strings[i].charAt(0);  // First character of current string

            if (firstIndexMap.containsKey(key)) {
                int j = firstIndexMap.get(key);

                // Swap current string with earlier matching one
                String temp = strings[i];
                strings[i] = strings[j];
                strings[j] = temp;

                // Remove the key to prevent further swaps with that character
                firstIndexMap.remove(key);
            } else {
                firstIndexMap.put(key, i);  // Save first occurrence
            }
        }

        return strings;
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Test case 1
        String[] input1 = {"ab", "ac"};
        System.out.println("Test 1: " + Arrays.toString(allSwap(input1)));
        // Expected: ["ac", "ab"]

        // Test case 2
        String[] input2 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        System.out.println("Test 2: " + Arrays.toString(allSwap(input2)));
        // Expected: ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]

        // Test case 3
        String[] input3 = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
        System.out.println("Test 3: " + Arrays.toString(allSwap(input3)));
        // Expected: ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
    }
}

