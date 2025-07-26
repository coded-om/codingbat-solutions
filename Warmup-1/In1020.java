public class In1020 {
        public static void main(String[] args) {
        System.out.println(in1020(21, 12));  
        System.out.println(in1020(8, 99));   
    }

    public static boolean in1020(int a, int b) {
        boolean aInRange = (a >= 10 && a <= 20);
        boolean bInRange = (b >= 10 && b <= 20);
        if (aInRange || bInRange) {
            return true;
        } else {
            return false;
        }
    }
}
