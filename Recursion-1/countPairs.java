public class CountPairs {

    // Recursive method to count pairs in a string
    public static int countPairs(String str) {
        if (str.length() < 3) {
            return 0; // base case: less than 3 chars can't form a pair
        }

        if (str.charAt(0) == str.charAt(2)) {
            return 1 + countPairs(str.substring(1)); // found a pair
        } else {
            return countPairs(str.substring(1)); // move to next position
        }
    }

    // Main method with test cases
    public static void main(String[] args) {
        System.out.println("countPairs(\"axa\") = " + countPairs("axa"));     // 1
        System.out.println("countPairs(\"axax\") = " + countPairs("axax"));   // 2
        System.out.println("countPairs(\"axbx\") = " + countPairs("axbx"));   // 1
        System.out.println("countPairs(\"AxAxA\") = " + countPairs("AxAxA")); // 3
    }
}

