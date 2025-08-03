public class BigDiff {

    public int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        return max - min;
    }

    public static void main(String[] args) {
        BigDiff obj = new BigDiff();

        System.out.println(obj.bigDiff(new int[]{10, 3, 5, 6})); // → 7
        System.out.println(obj.bigDiff(new int[]{7, 2, 10, 9})); // → 8
        System.out.println(obj.bigDiff(new int[]{2, 10, 7, 2})); // → 8
    }
}

