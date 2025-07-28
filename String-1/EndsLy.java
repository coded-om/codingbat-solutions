public class EndsLy {
    
    public static void main(String[] args) {
        EndsLy el = new EndsLy();
        System.out.println(el.endsLy("oddly"));
        System.out.println(el.endsLy("y"));
        System.out.println(el.endsLy("oddy"));
    }
    
    public boolean endsLy(String str) {
        if (str.length() < 2) {
            return false;
        }
        return str.substring(str.length() - 2).equals("ly");
    }
}
