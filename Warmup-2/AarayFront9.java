public class AarayFront9 {
    public static void main(String[] args) {
        AarayFront9 af9 = new AarayFront9();
        System.out.println(af9.arrayFront9(new int[]{1, 2, 9, 3, 4})); 
        System.out.println(af9.arrayFront9(new int[]{1, 2, 3, 4, 9}));
    }
    public boolean arrayFront9(int[] nums) {
  if (nums.length > 0 && nums[0] == 9) return true;
  if (nums.length > 1 && nums[1] == 9) return true;
  if (nums.length > 2 && nums[2] == 9) return true;
  if (nums.length > 3 && nums[3] == 9) return true;
  
  return false;
}
}
