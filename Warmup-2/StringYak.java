
public class StringYak {
    
    public static void main(String[] args) {
        StringYak sy = new StringYak();
        System.out.println(sy.stringYak("yakpak"));
        System.out.println(sy.stringYak("pakyak"));
        System.out.println(sy.stringYak("yak123ya"));
    }
    
    public String stringYak(String str) {
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            
            if (i + 2 < str.length()) {
                char first = str.charAt(i);
                char second = str.charAt(i + 1);
                char third = str.charAt(i + 2);
                
                if (first == 'y' && third == 'k') {
                    i = i + 2;
                } else {
                    result = result + first;
                }
            } else {
                result = result + str.charAt(i);
            }
        }
        
        return result;
    }
}
