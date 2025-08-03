public class ScoresClump {

    public static boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++) {
            if (scores[i + 2] - scores[i] <= 2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(scoresClump(new int[] {3, 4, 5}));       // true
        System.out.println(scoresClump(new int[] {3, 4, 6}));       // false
        System.out.println(scoresClump(new int[] {1, 3, 5, 5}));    // true
    }
} 
