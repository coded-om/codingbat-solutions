
public class Last2 {
    public static void main(String[] args) {
        Last2 l2 = new Last2();
        System.out.println(l2.last2("axxxaaxx"));
        System.out.println(l2.last2("xaxaxaxx")); 
        System.out.println(l2.last2("abcdefg"));
        System.out.println(l2.last2("x")); 
    }

    public int last2(String str) {
    if (str.length() < 2) return 0;

    String lastTwo = str.substring(str.length() - 2);
    int count = 0;

    for (int i = 0; i < str.length() - 2; i++) {
        String sub = str.substring(i, i + 2);
        if (sub.equals(lastTwo)) {
        count++;
        }
    }

    return count;
}

    
}
