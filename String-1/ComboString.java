public class ComboString {
    
    public static void main(String[] args) {
        ComboString cs = new ComboString();
        System.out.println(cs.comboString("Hello", "hi"));
        System.out.println(cs.comboString("hi", "Hello"));
        System.out.println(cs.comboString("aaa", "b"));
    }
    
    public String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }
}
