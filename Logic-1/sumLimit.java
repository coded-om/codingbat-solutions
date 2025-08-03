public class SumLimit {

    public static int sumLimit(int a, int b) {
        int sum = a + b;
        int lenA = String.valueOf(a).length();
        int lenSum = String.valueOf(sum).length();

        return lenSum == lenA ? sum : a;
    }

    public static void main(String[] args) {
        System.out.println(sumLimit(2, 3));  // → 5
        System.out.println(sumLimit(8, 3));  // → 8
        System.out.println(sumLimit(8, 1));  // → 9
        System.out.println(sumLimit(99, 1)); // → 99 (100 has 3 digits)
    }
}

