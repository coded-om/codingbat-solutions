public class ExtraFront {
    
    public static void main(String[] args) {
        ExtraFront ef = new ExtraFront();
        System.out.println(ef.extraFront("Hello"));
        System.out.println(ef.extraFront("ab"));
        System.out.println(ef.extraFront("H"));
        System.out.println(ef.extraFront(""));
        System.out.println(ef.extraFront("x"));
    }
    
    public String extraFront(String str) {
        String front = str.length() >= 2 ? str.substring(0, 2) : str;
        return front + front + front;
    }
}
