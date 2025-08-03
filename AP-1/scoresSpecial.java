public int scoresSpecial(int[] a, int[] b) {
  return largestSpecialScore(a) + largestSpecialScore(b);
}

public int largestSpecialScore(int[] scores) {
  int max = 0;
  for (int score : scores) {
    if (score % 10 == 0 && score > max) {
      max = score;
    }
  }
  return max;
}

