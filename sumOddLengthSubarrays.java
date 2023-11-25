class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int result = 0;
        int n = arr.length;

        for (int start = 0; start < n; start++) {
            for (int length = 1; start + length <= n; length += 2) {
                int end = start + length - 1;

                // Calculate the sum of the subarray from start to end
                for (int i = start; i <= end; i++) {
                    result += arr[i];
                }
            }
        }

        return result;
    }
}
