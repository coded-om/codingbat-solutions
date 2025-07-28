public class Has271 {
    
    public static void main(String[] args) {
        Has271 h271 = new Has271();
        System.out.println(h271.has271(new int[]{1, 2, 7, 1}));
        System.out.println(h271.has271(new int[]{1, 2, 8, 1}));
        System.out.println(h271.has271(new int[]{2, 7, 1}));
    }
    
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int val = nums[i];
            int second = nums[i + 1];
            int third = nums[i + 2];
            
            if (second == val + 5) {
                int diff = third - (val - 1);
                if (diff >= -2 && diff <= 2) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
