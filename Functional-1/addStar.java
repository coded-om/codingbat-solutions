import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddStarExample {

    // Method to append "*" to each string in the list
    public static List<String> addStar(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            result.add(str + "*");
        }
        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + addStar(Arrays.asList("a", "bb", "ccc")));     // [a*, bb*, ccc*]
        System.out.println("Test 2: " + addStar(Arrays.asList("hello", "there")));     // [hello*, there*]
        System.out.println("Test 3: " + addStar(Arrays.asList("*")));                  // [**]
    }
}

