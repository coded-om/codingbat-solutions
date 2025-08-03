import java.util.Arrays;

public class SeriesUpExample {

    // Method to generate the seriesUp pattern
    public static int[] seriesUp(int n) {
        int length = n * (n + 1) / 2;
        int[] result = new int[length];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            // Add numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                result[index++] = j;
            }
        }

        return result;
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("Test 1: " + Arrays.toString(seriesUp(3))); // [1, 1, 2, 1, 2, 3]
        System.out.println("Test 2: " + Arrays.toString(seriesUp(4))); // [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
        System.out.println("Test 3: " + Arrays.toString(seriesUp(2))); // [1, 1, 2]
    }
}

