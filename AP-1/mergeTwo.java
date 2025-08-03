public String[] mergeTwo(String[] a, String[] b, int n) {
    String[] result = new String[n];
    int i = 0, j = 0, k = 0;

    while (k < n) {
        int compare = a[i].compareTo(b[j]);
        if (compare < 0) {
            result[k++] = a[i++];
        } else if (compare > 0) {
            result[k++] = b[j++];
        } else {
            result[k++] = a[i++];
            j++;  // skip duplicate
        }
    }

    return result;
}

