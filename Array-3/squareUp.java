import java.util.Arrays;

public class SquareUpExample {

    // Method to generate the squareUp pattern
    public static int[] squareUp(int n) {
        int[] result = new int[n * n];

        for (int i = 1; i <= n; i++) {
            // Fill in the last i positions in the ith group
            for (int j = 0; j < i; j++) {
                result[i * n - 1 - j] = j + 1;
            }
        }

        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + Arrays.toString(squareUp(3))); // [0, 0, 1, 0, 2, 1, 3, 2, 1]
        System.out.println("Test 2: " + Arrays.toString(squareUp(2))); // [0, 1, 2, 1]
        System.out.println("Test 3: " + Arrays.toString(squareUp(4)));
        // [0, 0, 0, 1,
        //  0, 0, 2, 1,
        //  0, 3, 2, 1,
        //  4, 3, 2, 1]
    }
}

