import java.util.HashMap;
import java.util.Map;

public class MapAB2Example {

    // Method that removes "a" and "b" if they have equal values
    public static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Test case 1
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "aaa");
        map1.put("c", "cake");
        System.out.println("Test 1: " + mapAB2(map1));
        // Expected: {c=cake}

        // Test case 2
        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "aaa");
        map2.put("b", "bbb");
        System.out.println("Test 2: " + mapAB2(map2));
        // Expected: {a=aaa, b=bbb}

        // Test case 3
        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("b", "bbb");
        map3.put("c", "aaa");
        System.out.println("Test 3: " + mapAB2(map3));
        // Expected: {a=aaa, b=bbb, c=aaa}
    }
}

