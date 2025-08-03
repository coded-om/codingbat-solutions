public int commonTwo(String[] a, String[] b) {
    int i = 0, j = 0, count = 0;
    String last = "";

    while (i < a.length && j < b.length) {
        if (a[i].equals(b[j]) && !a[i].equals(last)) {
            count++;
            last = a[i];
            i++;
            j++;
        } else if (a[i].compareTo(b[j]) < 0) {
            i++;
        } else if (a[i].compareTo(b[j]) > 0) {
            j++;
        } else {
            // same string as last match, skip duplicates
            String temp = a[i];
            while (i < a.length && a[i].equals(temp)) i++;
            while (j < b.length && b[j].equals(temp)) j++;
        }
    }
    return count;
}

