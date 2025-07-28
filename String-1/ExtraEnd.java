public class ExtraEnd {
    
    public static void main(String[] args) {
        ExtraEnd ee = new ExtraEnd();
        System.out.println(ee.extraEnd("Hello"));
        System.out.println(ee.extraEnd("ab"));
        System.out.println(ee.extraEnd("Hi"));
    }
    
    public String extraEnd(String str) {
        String lastTwo = str.substring(str.length() - 2);
        return lastTwo + lastTwo + lastTwo;
    }
}
