public class Without2 {
    
    public static void main(String[] args) {
        Without2 w2 = new Without2();
        System.out.println(w2.without2("HelloHe"));
        System.out.println(w2.without2("HelloHi"));
        System.out.println(w2.without2("Hi"));
        System.out.println(w2.without2("Chocolate"));
        System.out.println(w2.without2("xxx"));
    }
    
    public String without2(String str) {
        if (str.length() < 2) {
            return str;
        }
        String first2 = str.substring(0, 2);
        String last2 = str.substring(str.length() - 2);
        
        if (first2.equals(last2)) {
            return str.substring(2);
        }
        return str;
    }
}
