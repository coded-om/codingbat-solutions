public class Right2 {
    
    public static void main(String[] args) {
        Right2 r2 = new Right2();
        System.out.println(r2.right2("Hello"));
        System.out.println(r2.right2("java"));
        System.out.println(r2.right2("Hi"));
    }
    
    public String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }
}
