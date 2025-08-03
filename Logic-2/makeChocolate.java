public int makeChocolate(int small, int big, int goal) {
    int maxBigBars = goal / 5;                  // Max big bars we can use
    int useBig = Math.min(big, maxBigBars);     // Use the smaller of available big bars or max needed
    int remaining = goal - (useBig * 5);        // Remaining kilos after using big bars

    if (small >= remaining) {
        return remaining;                       // Use remaining small bars to hit goal
    } else {
        return -1;                              // Not enough small bars to reach goal
    }
}

