import java.util.HashMap;
import java.util.Map;

public class MapShareExample {

    // Method to modify the map according to the problem description
    public static Map<String, String> mapShare(Map<String, String> map) {
        // If "a" has a value, set "b" to have the same value
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        // Always remove "c"
        map.remove("c");

        return map;
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Test case 1
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bbb");
        map1.put("c", "ccc");
        System.out.println("Test 1: " + mapShare(map1));  // Expected: {a=aaa, b=aaa}

        // Test case 2
        Map<String, String> map2 = new HashMap<>();
        map2.put("b", "xyz");
        map2.put("c", "ccc");
        System.out.println("Test 2: " + mapShare(map2));  // Expected: {b=xyz}

        // Test case 3
        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("c", "meh");
        map3.put("d", "hi");
        System.out.println("Test 3: " + mapShare(map3));  // Expected: {a=aaa, b=aaa, d=hi}
    }
}

