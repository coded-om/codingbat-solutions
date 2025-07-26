public class In3050 {
        public static void main(String[] args) {
        System.out.println(in3050(40, 50));  
        System.out.println(in3050(29, 31));  
    }

    public static boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
            return true;
        }
        if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
            return true;
        }
        return false;
    }
    
}
