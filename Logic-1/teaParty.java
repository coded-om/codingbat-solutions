public class TeaParty {

    public static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0; // bad
        } else if (tea >= 2 * candy || candy >= 2 * tea) {
            return 2; // great
        } else {
            return 1; // good
        }
    }

    public static void main(String[] args) {
        System.out.println(teaParty(6, 8));   // → 1 (good)
        System.out.println(teaParty(3, 8));   // → 0 (bad)
        System.out.println(teaParty(20, 6));  // → 2 (great)
    }
}

