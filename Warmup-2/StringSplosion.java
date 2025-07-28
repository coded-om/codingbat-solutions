
public class StringSplosion {
    public static void main(String[] args) {
        StringSplosion ss = new StringSplosion();
        System.out.println(ss.stringSplosion("abc")); 
        System.out.println(ss.stringSplosion("ab")); 
        System.out.println(ss.stringSplosion("")); 
    }

    public String stringSplosion(String str) {
    String result = "";
    for (int i = 1; i <= str.length(); i++) {
        result = result + str.substring(0, i);
    }
    
    return result;
}
}
