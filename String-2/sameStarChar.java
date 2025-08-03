public class SameStarChar {

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SameStarChar obj = new SameStarChar();

        System.out.println(obj.sameStarChar("xy*yzz"));  // → true
        System.out.println(obj.sameStarChar("xy*zzz"));  // → false
        System.out.println(obj.sameStarChar("*xa*az"));  // → true
        System.out.println(obj.sameStarChar("abc*def")); // → false
        System.out.println(obj.sameStarChar("a*ba"));    // → true
    }
}

