public class CountClumpsExample {

    // Method to count the number of clumps
    public static int countClumps(int[] nums) {
        int count = 0;
        boolean inClump = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (!inClump) {
                    count++;
                    inClump = true;
                }
            } else {
                inClump = false;
            }
        }

        return count;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + countClumps(new int[]{1, 2, 2, 3, 4, 4}));    // 2
        System.out.println("Test 2: " + countClumps(new int[]{1, 1, 2, 1, 1}));      // 2
        System.out.println("Test 3: " + countClumps(new int[]{1, 1, 1, 1, 1}));      // 1
    }
}

