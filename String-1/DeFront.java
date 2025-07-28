public class DeFront {
    
    public static void main(String[] args) {
        DeFront df = new DeFront();
        System.out.println(df.deFront("Hello"));
        System.out.println(df.deFront("java"));
        System.out.println(df.deFront("away"));
        System.out.println(df.deFront("abbe"));
        System.out.println(df.deFront("xb"));
    }
    
    public String deFront(String str) {
        String result = "";
        
        if (str.length() > 0 && str.charAt(0) == 'a') {
            result += str.charAt(0);
        }
        
        if (str.length() > 1 && str.charAt(1) == 'b') {
            result += str.charAt(1);
        }
        
        if (str.length() > 2) {
            result += str.substring(2);
        }
        
        return result;
    }
}
