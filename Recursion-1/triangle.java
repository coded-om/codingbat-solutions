public class TriangleBlocks {

    // Recursive method to compute total blocks in triangle
    public static int triangle(int n) {
        if (n == 0) {
            return 0; // base case
        }
        return n + triangle(n - 1); // recursive step
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("triangle(0) = " + triangle(0)); // 0
        System.out.println("triangle(1) = " + triangle(1)); // 1
        System.out.println("triangle(2) = " + triangle(2)); // 3
        System.out.println("triangle(3) = " + triangle(3)); // 6
        System.out.println("triangle(5) = " + triangle(5)); // 15
    }
}

