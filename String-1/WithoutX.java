public class WithoutX {
    
    public static void main(String[] args) {
        WithoutX wx = new WithoutX();
        System.out.println(wx.withoutX("xHix"));
        System.out.println(wx.withoutX("xHi"));
        System.out.println(wx.withoutX("Hxix"));
        System.out.println(wx.withoutX("Hi"));
        System.out.println(wx.withoutX("x"));
        System.out.println(wx.withoutX("xx"));
    }
    
    public String withoutX(String str) {
        if (str.length() == 0) {
            return str;
        }
        
        int start = 0;
        int end = str.length();
        
        if (str.charAt(0) == 'x') {
            start = 1;
        }
        
        if (str.length() > 1 && str.charAt(str.length() - 1) == 'x') {
            end = str.length() - 1;
        }
        
        return str.substring(start, end);
    }
}
