public class FrontAgain {
    
    public static void main(String[] args) {
        FrontAgain fa = new FrontAgain();
        System.out.println(fa.frontAgain("edited"));
        System.out.println(fa.frontAgain("edit"));
        System.out.println(fa.frontAgain("ed"));
        System.out.println(fa.frontAgain("jj"));
        System.out.println(fa.frontAgain("a"));
    }
    
    public boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }
        String front = str.substring(0, 2);
        String end = str.substring(str.length() - 2);
        return front.equals(end);
    }
}
