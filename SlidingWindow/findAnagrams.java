class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer> result = new ArrayList<>();
       Map<Character, Integer> m = new HashMap<>();

        for (char i : p.toCharArray()) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }

        int k = p.length();
        int count = m.size();
        int i = 0, j = 0;

        while (j < s.length()) {
            if (m.containsKey(s.charAt(j))) {
                m.put(s.charAt(j), m.get(s.charAt(j)) - 1);

                if (m.get(s.charAt(j)) == 0) {
                    count--;
                }
            }

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (count == 0) {
                    result.add(i);
                }

                if (m.containsKey(s.charAt(i))) {
                    m.put(s.charAt(i), m.get(s.charAt(i)) + 1);

                    if (m.get(s.charAt(i)) == 1) {
                        count++;
                    }
                }

                i++;
                j++;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> result = solution.findAnagrams(s, p);
        System.out.println("Output: " + result);
}
