public class NonStart {
    
    public static void main(String[] args) {
        NonStart ns = new NonStart();
        System.out.println(ns.nonStart("Hello", "There"));
        System.out.println(ns.nonStart("java", "code"));
        System.out.println(ns.nonStart("shotl", "java"));
    }
    
    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }
}
