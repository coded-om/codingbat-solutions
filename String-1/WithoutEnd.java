public class WithoutEnd {
    
    public static void main(String[] args) {
        WithoutEnd we = new WithoutEnd();
        System.out.println(we.withoutEnd("Hello"));
        System.out.println(we.withoutEnd("java"));
        System.out.println(we.withoutEnd("coding"));
    }
    
    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }
}
