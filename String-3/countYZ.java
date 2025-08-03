public class CountYZ {

    public int countYZ(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if ((c == 'y' || c == 'z')) {
                // check if it's the end of string or next character is not a letter
                if (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1))) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        CountYZ obj = new CountYZ();

        System.out.println(obj.countYZ("fez day"));     // → 2
        System.out.println(obj.countYZ("day fez"));     // → 2
        System.out.println(obj.countYZ("day fyyyz"));   // → 2
        System.out.println(obj.countYZ("yellow lazy")); // → 1 (only 'z' counts)
    }
}

