class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean foundWord = false; // Flag to track if we have started counting the last word
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (foundWord) {
                    // If we have found a word and encountered a space, it means we have reached the end of the last word
                    break;
                }
            } else {
                // If we encounter a non-space character, start counting the word
                count++;
                foundWord = true; // Set flag to true indicating we have started counting the last word
            }
        }
        return count;
    }
}
