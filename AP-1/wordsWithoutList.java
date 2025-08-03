import java.util.*;

public class WordsFilter {
    public static List<String> wordsWithoutList(String[] words, int len) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.length() != len) {
                result.add(word);
            }
        }
        return result;
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(wordsWithoutList(new String[] {"a", "bb", "b", "ccc"}, 1));  // [bb, ccc]
        System.out.println(wordsWithoutList(new String[] {"a", "bb", "b", "ccc"}, 3));  // [a, bb, b]
        System.out.println(wordsWithoutList(new String[] {"a", "bb", "b", "ccc"}, 4));  // [a, bb, b, ccc]
    }
}

