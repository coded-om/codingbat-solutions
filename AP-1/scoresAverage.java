public class ScoresAverage {

    public static int scoresAverage(int[] scores) {
        int mid = scores.length / 2;
        int firstHalfAvg = average(scores, 0, mid);
        int secondHalfAvg = average(scores, mid, scores.length);
        return Math.max(firstHalfAvg, secondHalfAvg);
    }

    public static int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += scores[i];
        }
        return sum / (end - start);
    }

    public static void main(String[] args) {
        System.out.println(scoresAverage(new int[] {2, 2, 4, 4}));          // 4
        System.out.println(scoresAverage(new int[] {4, 4, 4, 2, 2, 2}));    // 4
        System.out.println(scoresAverage(new int[] {3, 4, 5, 1, 2, 3}));    // 4
    }
}

