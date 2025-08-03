import java.util.HashMap;
import java.util.Map;

public class Topping1Example {

    // Method to modify toppings according to the rules
    public static Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Test case 1
        Map<String, String> map1 = new HashMap<>();
        map1.put("ice cream", "peanuts");
        System.out.println("Test 1: " + topping1(map1));  
        // Expected: {bread=butter, ice cream=cherry}

        // Test case 2
        Map<String, String> map2 = new HashMap<>();
        System.out.println("Test 2: " + topping1(map2));  
        // Expected: {bread=butter}

        // Test case 3
        Map<String, String> map3 = new HashMap<>();
        map3.put("pancake", "syrup");
        System.out.println("Test 3: " + topping1(map3));  
        // Expected: {bread=butter, pancake=syrup}
    }
}

