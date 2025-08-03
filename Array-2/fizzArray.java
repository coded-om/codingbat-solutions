public int[] fizzArray(int n) {
int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
}

    public static void main(String[] args) {
        FizzArray obj = new FizzArray();

        // Testing the method
        System.out.println(java.util.Arrays.toString(obj.fizzArray(4)));   // → [0, 1, 2, 3]
        System.out.println(java.util.Arrays.toString(obj.fizzArray(1)));   // → [0]
        System.out.println(java.util.Arrays.toString(obj.fizzArray(10)));  // → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
