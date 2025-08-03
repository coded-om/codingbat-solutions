public class XyzThere {

    public boolean xyzThere(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                if (i == 0 || str.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        XyzThere obj = new XyzThere();

        System.out.println(obj.xyzThere("abcxyz"));     // → true
        System.out.println(obj.xyzThere("abc.xyz"));    // → false
        System.out.println(obj.xyzThere("xyz.abc"));    // → true
    }
}

