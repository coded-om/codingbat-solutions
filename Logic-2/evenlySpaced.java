public boolean evenlySpaced(int a, int b, int c) {
    // Sort the numbers so that small <= medium <= large
    int small = Math.min(a, Math.min(b, c));
    int large = Math.max(a, Math.max(b, c));
    int medium = a + b + c - small - large;  // The remaining number

    return (medium - small) == (large - medium);
}

