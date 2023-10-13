class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String[] words = S.split("\\.");
        String reversed = "";
        for (int x = words.length-1; x >= 0; x--) {
            reversed += words[x] + ".";
        }
        return reversed.substring(0, reversed.length()-1);
    }
}