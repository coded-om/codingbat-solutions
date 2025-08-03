import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Copies3Example {

    // Method to return list where each string is repeated 3 times
    public static List<String> copies3(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            result.add(str + str + str);
        }
        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + copies3(Arrays.asList("a", "bb", "ccc")));         // [aaa, bbbbbb, ccccccccc]
        System.out.println("Test 2: " + copies3(Arrays.asList("24", "a", "")));            // [242424, aaa, ""]
        System.out.println("Test 3: " + copies3(Arrays.asList("hello", "there")));         // [hellohellohello, theretherethere]
    }
}

