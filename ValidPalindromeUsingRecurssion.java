class Solution {
    public boolean isPalindrome(String s) {
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return isPalindromeHelper(0, cleanedString);
    }

    private boolean isPalindromeHelper(int i, String s) {
        if (i >= s.length() / 2) {
            return true;
        }

        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }

        return isPalindromeHelper(i + 1, s);
    
    }
}
