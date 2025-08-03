public class MaxBlock {

    public int maxBlock(String str) {
        if (str.length() == 0) return 0;

        int max = 1;
        int current = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                current++;
                max = Math.max(max, current);
            } else {
                current = 1;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        MaxBlock obj = new MaxBlock();

        System.out.println(obj.maxBlock("hoopla"));         // → 2
        System.out.println(obj.maxBlock("abbCCCddBBBxx"));  // → 3
        System.out.println(obj.maxBlock(""));               // → 0
        System.out.println(obj.maxBlock("xyz"));            // → 1
        System.out.println(obj.maxBlock("xxxyyyzzz"));      // → 3
    }
}

