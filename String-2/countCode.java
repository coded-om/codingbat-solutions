public class CountCode {

    public int countCode(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' &&
                str.charAt(i + 1) == 'o' &&
                str.charAt(i + 3) == 'e') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        CountCode obj = new CountCode();

        System.out.println(obj.countCode("aaacodebbb"));      // → 1
        System.out.println(obj.countCode("codexxcode"));      // → 2
        System.out.println(obj.countCode("cozexxcope"));      // → 2
    }
}

