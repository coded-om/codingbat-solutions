public int bigHeights(int[] heights, int start, int end) {
  int bigSteps = 0;
  for (int i = start; i < end; i++) {
    int diff = Math.abs(heights[i + 1] - heights[i]);
    if (diff >= 5) {
      bigSteps++;
    }
  }
  return bigSteps;
}

