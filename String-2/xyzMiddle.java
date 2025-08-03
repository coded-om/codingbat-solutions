public class XyzMiddle {

    public boolean xyzMiddle(String str) {
        int len = str.length();

        for (int i = 0; i <= len - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                int left = i;
                int right = len - (i + 3);
                if (Math.abs(left - right) <= 1) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        XyzMiddle obj = new XyzMiddle();

        System.out.println(obj.xyzMiddle("AAxyzBB"));  // → true
        System.out.println(obj.xyzMiddle("AxyzBB"));   // → true
        System.out.println(obj.xyzMiddle("AxyzBBB"));  // → false
        System.out.println(obj.xyzMiddle("xyz"));      // → true
        System.out.println(obj.xyzMiddle("xy"));       // → false
    }
}

