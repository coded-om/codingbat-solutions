public class StarOut {

    public String starOut(String str) {
        StringBuilder result = new StringBuilder();
        int len = str.length();

        for (int i = 0; i < len; i++) {
            boolean isStar = str.charAt(i) == '*';
            boolean leftStar = (i > 0 && str.charAt(i - 1) == '*');
            boolean rightStar = (i < len - 1 && str.charAt(i + 1) == '*');

            // Keep character only if it's not a star and not adjacent to a star
            if (!isStar && !leftStar && !rightStar) {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        StarOut obj = new StarOut();

        System.out.println(obj.starOut("ab*cd"));     // → "ad"
        System.out.println(obj.starOut("ab**cd"));    // → "ad"
        System.out.println(obj.starOut("sm*eilly"));  // → "silly"
    }
}

