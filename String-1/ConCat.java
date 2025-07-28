public class ConCat {
    
    public static void main(String[] args) {
        ConCat cc = new ConCat();
        System.out.println(cc.conCat("abc", "cat"));
        System.out.println(cc.conCat("dog", "cat"));
        System.out.println(cc.conCat("abc", ""));
        System.out.println(cc.conCat("", "cat"));
        System.out.println(cc.conCat("", ""));
    }
    
    public String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0 && 
            a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        }
        return a + b;
    }
}
