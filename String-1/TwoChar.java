public class TwoChar {
    
    public static void main(String[] args) {
        TwoChar tc = new TwoChar();
        System.out.println(tc.twoChar("java", 0));
        System.out.println(tc.twoChar("java", 2));
        System.out.println(tc.twoChar("java", 3));
        System.out.println(tc.twoChar("java", -1));
        System.out.println(tc.twoChar("Hello", 1));
    }
    
    public String twoChar(String str, int index) {
        if (index < 0 || index + 2 > str.length()) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }
}
