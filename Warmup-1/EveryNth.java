public class EveryNth {
        public static void main(String[] args) {
        System.out.println(everyNth("abcdefg", 3));
        System.out.println(everyNth("Java", 1));
    }
    public static String everyNth(String str, int n) {
        String result = "";
        int i = 0;
        while (i< str.length()) {
            result += str.charAt(i);
            i += n;
    }
    return result;
}

}
