import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoXExample {

    // Method to remove all 'x' characters from each string
    public static List<String> noX(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            result.add(str.replace("x", ""));
        }
        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + noX(Arrays.asList("ax", "bb", "cx")));           // [a, bb, c]
        System.out.println("Test 2: " + noX(Arrays.asList("xxax", "xbxbx", "xxcx")));    // [a, bb, c]
        System.out.println("Test 3: " + noX(Arrays.asList("x")));                        // [""]
    }
}

