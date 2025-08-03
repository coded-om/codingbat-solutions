import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerExample {

    // Method to convert each string to lowercase
    public static List<String> lower(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            result.add(str.toLowerCase());
        }
        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + lower(Arrays.asList("Hello", "Hi")));              // [hello, hi]
        System.out.println("Test 2: " + lower(Arrays.asList("AAA", "BBB", "ccc")));        // [aaa, bbb, ccc]
        System.out.println("Test 3: " + lower(Arrays.asList("KitteN", "ChocolaTE")));      // [kitten, chocolate]
    }
}

