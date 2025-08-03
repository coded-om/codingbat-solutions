public class CountEvens {

    public int countEvens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountEvens obj = new CountEvens();

        System.out.println(obj.countEvens(new int[]{2, 1, 2, 3, 4}));  // → 3
        System.out.println(obj.countEvens(new int[]{2, 2, 0}));        // → 3
        System.out.println(obj.countEvens(new int[]{1, 3, 5}));        // → 0
    }
}

