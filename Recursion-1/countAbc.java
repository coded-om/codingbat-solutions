ic static int countAbc(String str) {
        if (str.length() < 3) {
            return 0; // base case
        }

        String sub = str.substring(0, 3);
        if (sub.equals("abc") || sub.equals("aba")) {
            return 1 + countAbc(str.substring(1));
        } else {
            return countAbc(str.substring(1));
        }
