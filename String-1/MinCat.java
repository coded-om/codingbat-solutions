public class MinCat {
    
    public static void main(String[] args) {
        MinCat mc = new MinCat();
        System.out.println(mc.minCat("Hello", "Hi"));
        System.out.println(mc.minCat("Hello", "java"));
        System.out.println(mc.minCat("java", "Hello"));
        System.out.println(mc.minCat("abc", "x"));
        System.out.println(mc.minCat("", "Hello"));
    }
    
    public String minCat(String a, String b) {
        int minLen = Math.min(a.length(), b.length());
        String aPart = a.substring(a.length() - minLen);
        String bPart = b.substring(b.length() - minLen);
        return aPart + bPart;
    }
}
