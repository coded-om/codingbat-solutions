public class SameEnds {

    public static boolean sameEnds(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[nums.length - n + i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 1)); // false
        System.out.println(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 2)); // true
        System.out.println(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 3)); // false
        System.out.println(sameEnds(new int[]{1, 2, 3, 1, 2, 3}, 3));       // true
        System.out.println(sameEnds(new int[]{1, 2, 3, 4}, 0));             // true
    }
}

