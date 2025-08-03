import java.util.HashMap;
import java.util.Map;

public class Topping2Example {

    // Method to modify the map as specified
    public static Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }

    // Main method with test cases
    public static void main(String[] args) {
        // Test case 1
        Map<String, String> map1 = new HashMap<>();
        map1.put("ice cream", "cherry");
        System.out.println("Test 1: " + topping2(map1));  
        // Expected: {ice cream=cherry, yogurt=cherry}

        // Test case 2
        Map<String, String> map2 = new HashMap<>();
        map2.put("spinach", "dirt");
        map2.put("ice cream", "cherry");
        System.out.println("Test 2: " + topping2(map2));  
        // Expected: {spinach=nuts, ice cream=cherry, yogurt=cherry}

        // Test case 3
        Map<String, String> map3 = new HashMap<>();
        map3.put("yogurt", "salt");
        System.out.println("Test 3: " + topping2(map3));  
        // Expected: {yogurt=salt}
    }
}

