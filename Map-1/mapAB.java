import java.util.HashMap;
import java.util.Map;

public class MapABExample {

    // Method that adds key "ab" if both "a" and "b" exist
    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Test case 1
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "Hi");
        map1.put("b", "There");
        System.out.println("Test 1: " + mapAB(map1));  // {a=Hi, b=There, ab=HiThere}

        // Test case 2
        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "Hi");
        System.out.println("Test 2: " + mapAB(map2));  // {a=Hi}

        // Test case 3
        Map<String, String> map3 = new HashMap<>();
        map3.put("b", "There");
        System.out.println("Test 3: " + mapAB(map3));  // {b=There}
    }
}

