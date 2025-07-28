public class LastChars {
    
    public static void main(String[] args) {
        LastChars lc = new LastChars();
        System.out.println(lc.lastChars("last", "chars"));
        System.out.println(lc.lastChars("yo", "java"));
        System.out.println(lc.lastChars("hi", ""));
        System.out.println(lc.lastChars("", "hello"));
        System.out.println(lc.lastChars("", ""));
    }
    
    public String lastChars(String a, String b) {
        String firstChar = a.length() > 0 ? a.substring(0, 1) : "@";
        String lastChar = b.length() > 0 ? b.substring(b.length() - 1) : "@";
        return firstChar + lastChar;
    }
}
