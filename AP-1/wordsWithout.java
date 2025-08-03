public String[] wordsWithout(String[] words, String target) {
  int count = 0;

  // First pass: count how many strings are NOT equal to target
  for (String word : words) {
    if (!word.equals(target)) {
      count++;
    }
  }

  // Create a new array with the correct size
  String[] result = new String[count];
  int index = 0;

  // Second pass: copy over only strings not equal to target
  for (String word : words) {
    if (!word.equals(target)) {
      result[index] = word;
      index++;
    }
  }

  return result;
}

