public class FirstLast6 {
    
    public static void main(String[] args) {
        FirstLast6 fl6 = new FirstLast6();
        System.out.println(fl6.firstLast6(new int[]{1, 2, 6}));
        System.out.println(fl6.firstLast6(new int[]{6, 1, 2, 3}));
        System.out.println(fl6.firstLast6(new int[]{13, 6, 1, 2, 3}));
        System.out.println(fl6.firstLast6(new int[]{6}));
        System.out.println(fl6.firstLast6(new int[]{3, 6, 4}));
    }
    
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6) {
            return true;
        }
        if (nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }
}
