public class IntMax {
        public static void main(String[] args) {
        System.out.println(intMax(1, 2, 3));  // 3
    }

    public static int intMax(int a, int b, int c) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    
}
