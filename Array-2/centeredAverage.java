public class CenteredAverage {

    public int centeredAverage(int[] nums) {
        int sum = 0;
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        sum -= min;
        sum -= max;

        return sum / (nums.length - 2); // Remove one min and one max
    }

    public static void main(String[] args) {
        CenteredAverage obj = new CenteredAverage();

        System.out.println(obj.centeredAverage(new int[]{1, 2, 3, 4, 100}));       // → 3
        System.out.println(obj.centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));  // → 5
        System.out.println(obj.centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}));// → -3
    }
}

