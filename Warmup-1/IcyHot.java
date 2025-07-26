public class IcyHot {
        public static void main(String[] args) {
        System.out.println(icyHot(-5, 120));  // true
        System.out.println(icyHot(-5, 90));   
    }

    public static boolean icyHot(int temp1, int temp2) {
        if (temp1 < 0 && temp2 > 100) {
            return true;
        }
        if (temp1 > 100 && temp2 < 0) {
            return true;
        }
        return false;
    }
    
}
