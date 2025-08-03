public int scoreUp(String[] key, String[] answers) {
  int score = 0;

  for (int i = 0; i < key.length; i++) {
    if (answers[i].equals("?")) {
      continue; // +0 points for blank answers
    } else if (answers[i].equals(key[i])) {
      score += 4; // +4 for correct answers
    } else {
      score -= 1; // -1 for incorrect answers
    }
  }

  return score;
}

