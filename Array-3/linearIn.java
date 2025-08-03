public class LinearInExample {

    // Method to check if all elements of inner[] are in outer[]
    public static boolean linearIn(int[] outer, int[] inner) {
        int i = 0; // pointer for outer
        int j = 0; // pointer for inner

        while (i < outer.length && j < inner.length) {
            if (outer[i] < inner[j]) {
                i++;
            } else if (outer[i] == inner[j]) {
                i++;
                j++;
            } else { // outer[i] > inner[j]
                return false;
            }
        }

        return j == inner.length; // all inner elements matched
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}));       // true
        System.out.println("Test 2: " + linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));    // false
        System.out.println("Test 3: " + linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}));    // true
    }
}

