 if (str.length() < sub.length()) {
            return 0; // base case
        }

        if (str.startsWith(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        } else {
            return strCount(str.substring(1), sub);
        }
