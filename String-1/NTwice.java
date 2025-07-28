public class NTwice {
    
    public static void main(String[] args) {
        NTwice nt = new NTwice();
        System.out.println(nt.nTwice("Hello", 2));
        System.out.println(nt.nTwice("Chocolate", 3));
        System.out.println(nt.nTwice("Chocolate", 1));
    }
    
    public String nTwice(String str, int n) {
        String first = str.substring(0, n);
        String last = str.substring(str.length() - n);
        return first + last;
    }
}
