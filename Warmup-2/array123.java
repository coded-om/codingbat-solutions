
public class array123 {
    public boolean array123(int[] nums) {
    if (nums.length >= 3) {
        if (nums[0] == 1 && nums[1] == 2 && nums[2] == 3) return true;
        if (nums.length >= 4 && nums[1] == 1 && nums[2] == 2 && nums[3] == 3) return true;
        if (nums.length >= 5 && nums[2] == 1 && nums[3] == 2 && nums[4] == 3) return true;
        if (nums.length >= 6 && nums[3] == 1 && nums[4] == 2 && nums[5] == 3)
            return true;
}
    return false;
}

}
