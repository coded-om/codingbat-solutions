public class Sum13 {

    public int sum13(int[] nums) {
        int sum = 0;
        int i = 0;

        while (i < nums.length) {
            if (nums[i] == 13) {
                i += 2; // Skip 13 and the number after it
            } else {
                sum += nums[i];
                i++;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Sum13 obj = new Sum13();

        System.out.println(obj.sum13(new int[]{1, 2, 2, 1}));       // → 6
        System.out.println(obj.sum13(new int[]{1, 1}));             // → 2
        System.out.println(obj.sum13(new int[]{1, 2, 2, 1, 13}));   // → 6
        System.out.println(obj.sum13(new int[]{13, 1, 2, 13, 2}));  // → 2
    }
}

