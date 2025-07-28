public class WithouEnd2 {
    
    public static void main(String[] args) {
        WithouEnd2 we2 = new WithouEnd2();
        System.out.println(we2.withouEnd2("Hello"));
        System.out.println(we2.withouEnd2("abc"));
        System.out.println(we2.withouEnd2("ab"));
        System.out.println(we2.withouEnd2("a"));
        System.out.println(we2.withouEnd2(""));
    }
    
    public String withouEnd2(String str) {
        if (str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }
}
