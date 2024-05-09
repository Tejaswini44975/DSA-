class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        reverse(happiness);
        int i = 0;
        long res = 0;

        while (k-- > 0) {
            happiness[i] = Math.max(happiness[i] - i, 0);
            res += happiness[i++];
        }

        return res;
    }

    private void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
