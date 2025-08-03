public class SameEnds {

    public String sameEnds(String str) {
        int len = str.length();
        int maxLen = len / 2;

        for (int i = maxLen; i > 0; i--) {
            String start = str.substring(0, i);
            String end = str.substring(len - i);

            if (start.equals(end)) {
                return start;
            }
        }

        return "";
    }

    public static void main(String[] args) {
        SameEnds obj = new SameEnds();

        System.out.println(obj.sameEnds("abXYab"));  // → "ab"
        System.out.println(obj.sameEnds("xx"));      // → "x"
        System.out.println(obj.sameEnds("xxx"));     // → "x"
        System.out.println(obj.sameEnds("123123"));  // → "123"
        System.out.println(obj.sameEnds("abc"));     // → ""
    }
}

