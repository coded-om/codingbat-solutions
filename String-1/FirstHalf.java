public class FirstHalf {
    
    public static void main(String[] args) {
        FirstHalf fh = new FirstHalf();
        System.out.println(fh.firstHalf("WooHoo"));
        System.out.println(fh.firstHalf("HelloThere"));
        System.out.println(fh.firstHalf("abcdef"));
    }
    
    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }
}
