public boolean makeBricks(int small, int big, int goal) {
    int maxBigBricksUsable = Math.min(big, goal / 5);
    int remainingLength = goal - (maxBigBricksUsable * 5);
    return small >= remainingLength;
}

