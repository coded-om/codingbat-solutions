public class Lucky13 {

    public boolean lucky13(int[] nums) {
        for (int num : nums) {
            if (num == 1 || num == 3) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Lucky13 obj = new Lucky13();

        System.out.println(obj.lucky13(new int[]{0, 2, 4}));    // → true
        System.out.println(obj.lucky13(new int[]{1, 2, 3}));    // → false
        System.out.println(obj.lucky13(new int[]{1, 2, 4}));    // → false
    }
}

