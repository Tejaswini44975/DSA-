class Solution {
    public int longestkSubstr(String s, int k) {
        if (s == null || s.length() == 0 || k <= 0) {
            return -1;
        }

        int maxLength = -1;
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> charCount = new HashMap<>();

        while (j < s.length()) {
            charCount.put(s.charAt(j), charCount.getOrDefault(s.charAt(j), 0) + 1);

            if (charCount.size() == k) {
                maxLength = Math.max(maxLength, j - i + 1);
            } else if (charCount.size() > k) {
                while (charCount.size() > k) {
                    charCount.put(s.charAt(i), charCount.get(s.charAt(i)) - 1);
                    if (charCount.get(s.charAt(i)) == 0) {
                        charCount.remove(s.charAt(i));
                    }
                    i++;
                }
            }

            j++;
        }

        return maxLength;
    }
}
