public class CountHi {

    public int countHi(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        CountHi obj = new CountHi();

        System.out.println(obj.countHi("abc hi ho"));  // → 1
        System.out.println(obj.countHi("ABChi hi"));   // → 2
        System.out.println(obj.countHi("hihi"));       // → 2
    }
}

