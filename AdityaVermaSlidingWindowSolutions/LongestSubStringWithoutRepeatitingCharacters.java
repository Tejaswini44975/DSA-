class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int maxLength = 0;
        HashMap<Character, Integer> mp = new HashMap<>();
        
        while (j < s.length()) {
            mp.put(s.charAt(j), mp.getOrDefault(s.charAt(j), 0) + 1);
            
            if (mp.size() == j - i + 1)
            {
                maxLength = Math.max(maxLength, j - i + 1);
                j++;
            } 
            else if (mp.size() < j - i + 1)
             {
                while (mp.size() < j - i + 1) 
                {
                    mp.put(s.charAt(i), mp.get(s.charAt(i)) - 1);
                    if (mp.get(s.charAt(i)) == 0) 
                    {
                        mp.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            } 
            else 
            {
                j++;
            }
        }
        
        return maxLength;
    }
}
