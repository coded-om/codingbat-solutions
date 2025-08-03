public class Has12 {

    public static boolean has12(int[] nums) {
        boolean found1 = false;
        for (int num : nums) {
            if (num == 1) {
                found1 = true; // Found 1, now look for a 2
            } else if (found1 && num == 2) {
                return true; // Found a 2 after a 1
            }
        }
        return false; // No 1 followed by 2 found
    }

    public static void main(String[] args) {
        System.out.println(has12(new int[]{1, 3, 2}));        // true
        System.out.println(has12(new int[]{3, 1, 2}));        // true
        System.out.println(has12(new int[]{3, 1, 4, 5, 2}));  // true
        System.out.println(has12(new int[]{3, 2, 1}));        // false
        System.out.println(has12(new int[]{1, 3, 4}));        // false
    }
}

