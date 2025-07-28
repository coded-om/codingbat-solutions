
public class StringX {
    public static void main(String[] args) {
        StringX sx = new StringX();
        System.out.println(sx.stringX("xabxxxcdx"));
    }
    public String stringX(String str) {
  String result = "";

  for (int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);
    if (i == 0 || i == str.length() - 1 || ch != 'x') {
      result += ch;
    }
  }
  return result;
}

    
}
