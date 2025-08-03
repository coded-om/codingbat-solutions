import java.util.HashMap;
import java.util.Map;

public class MapAB3Example {

    // Method to mirror "a" and "b" values if only one is present
    public static Map<String, String> mapAB3(Map<String, String> map) {
        boolean hasA = map.containsKey("a");
        boolean hasB = map.containsKey("b");

        if (hasA && !hasB) {
            map.put("b", map.get("a"));
        } else if (!hasA && hasB) {
            map.put("a", map.get("b"));
        }

        return map;
    }

    // Main method with test cases
    public static void main(String[] args) {
        // Test case 1
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("c", "cake");
        System.out.println("Test 1: " + mapAB3(map1));
        // Expected: {a=aaa, b=aaa, c=cake}

        // Test case 2
        Map<String, String> map2 = new HashMap<>();
        map2.put("b", "bbb");
        map2.put("c", "cake");
        System.out.println("Test 2: " + mapAB3(map2));
        // Expected: {a=bbb, b=bbb, c=cake}

        // Test case 3
        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("b", "bbb");
        map3.put("c", "cake");
        System.out.println("Test 3: " + mapAB3(map3));
        // Expected: {a=aaa, b=bbb, c=cake}
    }
}

