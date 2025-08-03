public class WithoutDoubles {

    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            die1 = (die1 == 6) ? 1 : die1 + 1;
        }
        return die1 + die2;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(withoutDoubles(2, 3, true));   // → 5
        System.out.println(withoutDoubles(3, 3, true));   // → 7
        System.out.println(withoutDoubles(3, 3, false));  // → 6
        System.out.println(withoutDoubles(6, 6, true));   // → 7
    }
}

