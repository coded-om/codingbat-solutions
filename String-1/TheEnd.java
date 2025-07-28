public class TheEnd {
    
    public static void main(String[] args) {
        TheEnd te = new TheEnd();
        System.out.println(te.theEnd("Hello", true));
        System.out.println(te.theEnd("Hello", false));
        System.out.println(te.theEnd("oh", true));
    }
    
    public String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }
}
