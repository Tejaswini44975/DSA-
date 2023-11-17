class Solution
{
    static boolean findsum(int arr[],int n)
    {
        Set<Integer> set = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            // If the sum becomes 0 or if the sum is already in the set, there is a subarray with sum 0.
            if (sum == 0 || set.contains(sum) || arr[i] == 0) {
                return true;
            }

            // Add the current sum to the set.
            set.add(sum);
        }

        // If no subarray with sum 0 is found.
        return false;
    }
}
