import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoreYExample {

    // Method to add "y" at the start and end of each string
    public static List<String> moreY(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            result.add("y" + str + "y");
        }
        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + moreY(Arrays.asList("a", "b", "c")));         // [yay, yby, ycy]
        System.out.println("Test 2: " + moreY(Arrays.asList("hello", "there")));     // [yhelloy, ytherey]
        System.out.println("Test 3: " + moreY(Arrays.asList("yay")));                // [yyayy]
    }
}

