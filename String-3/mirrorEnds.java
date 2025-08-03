public class MirrorEnds {

    public String mirrorEnds(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                result.append(str.charAt(i));
            } else {
                break;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        MirrorEnds obj = new MirrorEnds();

        System.out.println(obj.mirrorEnds("abXYZba"));  // → "ab"
        System.out.println(obj.mirrorEnds("abca"));     // → "a"
        System.out.println(obj.mirrorEnds("aba"));      // → "aba"
        System.out.println(obj.mirrorEnds("xyz"));      // → ""
    }
}

