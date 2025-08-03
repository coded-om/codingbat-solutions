public class Blackjack {

    public static int blackjack(int a, int b) {
        if (a > 21 && b > 21) return 0;
        if (a > 21) return b;
        if (b > 21) return a;
        return (21 - a <= 21 - b) ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(blackjack(19, 21)); // → 21
        System.out.println(blackjack(21, 19)); // → 21
        System.out.println(blackjack(19, 22)); // → 19
    }
} 

