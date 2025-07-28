
public class StringBits {
    public static void main(String[] args) {
        StringBits sb = new StringBits();
        System.out.println(sb.stringBits("Hi")); 
        System.out.println(sb.stringBits("Heeololeo"));
        System.out.println(sb.stringBits("x"));
        System.out.println(sb.stringBits("")); 
        System.out.println(sb.stringBits("0123456789")); 
    }
    public String stringBits(String str) {
  String result = "";

  for (int i = 0; i < str.length(); i = i + 2) {
    char ch = str.charAt(i);  
    result = result + ch;
  }

  return result;
}
    
}
