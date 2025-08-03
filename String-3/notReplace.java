public class NotReplace {

    public String notReplace(String str) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            // Check for "is" at position i
            if (i + 1 < str.length() && str.substring(i, i + 2).equals("is")) {
                // Check if it's a whole word (not surrounded by letters)
                boolean beforeOK = (i == 0 || !Character.isLetter(str.charAt(i - 1)));
                boolean afterOK = (i + 2 == str.length() || !Character.isLetter(str.charAt(i + 2)));

                if (beforeOK && afterOK) {
                    result.append("is not");
                    i += 2; // skip "is"
                    continue;
                }
            }

            // Append current character and move on
            result.append(str.charAt(i));
            i++;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        NotReplace obj = new NotReplace();

        System.out.println(obj.notReplace("is test"));        // → "is not test"
        System.out.println(obj.notReplace("is-is"));          // → "is not-is not"
        System.out.println(obj.notReplace("This is right"));  // → "This is not right"
        System.out.println(obj.notReplace("this is his"));    // → "this is not his"
        System.out.println(obj.notReplace("is"));             // → "is not"
    }
}

