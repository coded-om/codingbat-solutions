public class Left2 {
    
    public static void main(String[] args) {
        Left2 l2 = new Left2();
        System.out.println(l2.left2("Hello"));
        System.out.println(l2.left2("java"));
        System.out.println(l2.left2("Hi"));
    }
    
    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }
}
