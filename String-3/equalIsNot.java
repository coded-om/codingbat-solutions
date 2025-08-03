public class EqualIsNot {

    public boolean equalIsNot(String str) {
        int countIs = 0;
        int countNot = 0;

        for (int i = 0; i <= str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals("is")) {
                countIs++;
            }
        }

        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("not")) {
                countNot++;
            }
        }

        return countIs == countNot;
    }

    public static void main(String[] args) {
        EqualIsNot obj = new EqualIsNot();

        System.out.println(obj.equalIsNot("This is not"));            // false
        System.out.println(obj.equalIsNot("This is notnot"));         // true
        System.out.println(obj.equalIsNot("noisxxnotyynotxisi"));     // true
    }
}

