import java.util.HashMap;
import java.util.Map;

public class Topping3Example {

    // Method to modify the map based on potato and salad keys
    public static Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    // Main method to run test cases
    public static void main(String[] args) {
        // Test case 1
        Map<String, String> map1 = new HashMap<>();
        map1.put("potato", "ketchup");
        System.out.println("Test 1: " + topping3(map1));
        // Expected: {potato=ketchup, fries=ketchup}

        // Test case 2
        Map<String, String> map2 = new HashMap<>();
        map2.put("potato", "butter");
        System.out.println("Test 2: " + topping3(map2));
        // Expected: {potato=butter, fries=butter}

        // Test case 3
        Map<String, String> map3 = new HashMap<>();
        map3.put("salad", "oil");
        map3.put("potato", "ketchup");
        System.out.println("Test 3: " + topping3(map3));
        // Expected: {salad=oil, spinach=oil, potato=ketchup, fries=ketchup}
    }
}

