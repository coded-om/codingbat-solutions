
public class NoTriples {
    
    public static void main(String[] args) {
        NoTriples nt = new NoTriples();
        System.out.println(nt.noTriples(new int[]{1, 1, 2, 2, 2, 1}));
        System.out.println(nt.noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));

    }
    
    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int first = nums[i];
            if (nums[i + 1] == first && nums[i + 2] == first) {
                return false;
            }
        }
        
        return true;
    }
}
