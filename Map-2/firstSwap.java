import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstSwapExample {

    public static String[] firstSwap(String[] strings) {
        Map<Character, Integer> indexMap = new HashMap<>();   // first occurrence
        Set<Character> swapped = new HashSet<>();              // characters that have swapped once

        for (int i = 0; i < strings.length; i++) {
            char key = strings[i].charAt(0);

            // Skip if this character is already locked (swap done once)
            if (swapped.contains(key)) {
                continue;
            }

            // Swap if it's a second match and hasn't swapped before
            if (indexMap.containsKey(key)) {
                int j = indexMap.get(key);

                // Swap current and first matching string
                String temp = strings[i];
                strings[i] = strings[j];
                strings[j] = temp;

                // Mark this character as swapped
                swapped.add(key);
                indexMap.remove(key); // No further swap with this char
            } else {
                indexMap.put(key, i); // Record first occurrence
            }
        }

        return strings;
    }

    // Main method with test cases
    public static void main(String[] args) {
        String[] input1 = {"ab", "ac"};
        System.out.println("Test 1: " + Arrays.toString(firstSwap(input1)));
        // Expected: ["ac", "ab"]

        String[] input2 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        System.out.println("Test 2: " + Arrays.toString(firstSwap(input2)));
        // Expected: ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]

        String[] input3 = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
        System.out.println("Test 3: " + Arrays.toString(firstSwap(input3)));
        // Expected: ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
    }
}

