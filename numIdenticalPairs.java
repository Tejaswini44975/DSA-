class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int num : nums) {
            // Get the current count of occurrences of num
            int currentCount = occurrences.getOrDefault(num, 0);

            // Add the current count to the total count (number of good pairs)
            count += currentCount;

            // Increment the count of occurrences of num
            occurrences.put(num, currentCount + 1);
        }

        return count;
    }
}
