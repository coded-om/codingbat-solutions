public class WithoutX2 {
    
    public static void main(String[] args) {
        WithoutX2 wx2 = new WithoutX2();
        System.out.println(wx2.withoutX2("xHi"));
        System.out.println(wx2.withoutX2("Hxi"));
        System.out.println(wx2.withoutX2("Hi"));
        System.out.println(wx2.withoutX2("xxHi"));
        System.out.println(wx2.withoutX2("Hix"));
        System.out.println(wx2.withoutX2("x"));
        System.out.println(wx2.withoutX2("xx"));
    }
    
    public String withoutX2(String str) {
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            if (i < 2 && str.charAt(i) == 'x') {
                // Skip 'x' in first 2 positions
            } else {
                result += str.charAt(i);
            }
        }
        
        return result;
    }
}
