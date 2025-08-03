import java.util.HashMap;
import java.util.Map;

public class MapAB4Example {

    // Method to modify map based on the lengths of values "a" and "b"
    public static Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String aVal = map.get("a");
            String bVal = map.get("b");

            if (aVal.length() > bVal.length()) {
                map.put("c", aVal);
            } else if (bVal.length() > aVal.length()) {
                map.put("c", bVal);
            } else { // lengths are equal
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    // Main method with test cases
    public static void main(String[] args) {
        // Test case 1
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bb");
        map1.put("c", "cake");
        System.out.println("Test 1: " + mapAB4(map1));
        // Expected: {a=aaa, b=bb, c=aaa}

        // Test case 2
        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "aa");
        map2.put("b", "bbb");
        map2.put("c", "cake");
        System.out.println("Test 2: " + mapAB4(map2));
        // Expected: {a=aa, b=bbb, c=bbb}

        // Test case 3
        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aa");
        map3.put("b", "bbb");
        System.out.println("Test 3: " + mapAB4(map3));
        // Expected: {a=aa, b=bbb, c=bbb}

        // Test case 4 (equal lengths)
        Map<String, String> map4 = new HashMap<>();
        map4.put("a", "xx");
        map4.put("b", "yy");
        System.out.println("Test 4: " + mapAB4(map4));
        // Expected: {a=, b=}
    }
}

