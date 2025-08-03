public class TwoTwo {

    public static boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                // Check if it's not part of a pair
                if ((i > 0 && nums[i - 1] == 2) || (i < nums.length - 1 && nums[i + 1] == 2)) {
                    // It's part of a valid pair; continue
                    continue;
                } else {
                    // Lone 2 found
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(twoTwo(new int[]{4, 2, 2, 3}));   // true
        System.out.println(twoTwo(new int[]{2, 2, 4}));      // true
        System.out.println(twoTwo(new int[]{2, 2, 4, 2}));   // false
        System.out.println(twoTwo(new int[]{1, 3, 2}));      // false
        System.out.println(twoTwo(new int[]{2, 2, 2, 2}));   // true
    }
}

