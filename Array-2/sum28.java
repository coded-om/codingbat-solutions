public class Sum28 {

    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num == 2) {
                sum += 2;
            }
        }
        return sum == 8;
    }

    public static void main(String[] args) {
        Sum28 obj = new Sum28();

        System.out.println(obj.sum28(new int[]{2, 3, 2, 2, 4, 2}));       // → true
        System.out.println(obj.sum28(new int[]{2, 3, 2, 2, 4, 2, 2}));    // → false
        System.out.println(obj.sum28(new int[]{1, 2, 3, 4}));            // → false
    }
}

