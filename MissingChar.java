public class MissingChar {
        public static void main(String[] args) {
        System.out.println(missingChar("Mohammed", 1));
        System.out.println(missingChar("Al_Sweek", 2));
    }

    public static String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1);
        return front + back;
    }
    
}
