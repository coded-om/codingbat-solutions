public class AtFirst {
    
    public static void main(String[] args) {
        AtFirst af = new AtFirst();
        System.out.println(af.atFirst("hello"));
        System.out.println(af.atFirst("hi"));
        System.out.println(af.atFirst("h"));
        System.out.println(af.atFirst(""));
    }
    
    public String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str + "@";
        } else {
            return "@@";
        }
    }
}
