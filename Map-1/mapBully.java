import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a") && map.get("a") != null) {
            map.put("b", map.get("a"));  // Assign value of "a" to "b"
            map.put("a", "");            // Set "a" to empty string
        }
        return map;
    }

    // Sample test runner
    public static void main(String[] args) {
        Map<String, String> example1 = new HashMap<>();
        example1.put("a", "candy");
        example1.put("b", "dirt");

        Map<String, String> example2 = new HashMap<>();
        example2.put("a", "candy");

        Map<String, String> example3 = new HashMap<>();
        example3.put("a", "candy");
        example3.put("b", "carrot");
        example3.put("c", "meh");

        System.out.println("Test 1: " + mapBully(example1));  // → {a=, b=candy}
        System.out.println("Test 2: " + mapBully(example2));  // → {a=, b=candy}
        System.out.println("Test 3: " + mapBully(example3));  // → {a=, b=candy, c=meh}
    }
}

