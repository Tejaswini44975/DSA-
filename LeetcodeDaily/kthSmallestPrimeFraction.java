class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        double low = 0.0, high = 1.0;
        
        while (low < high) {
            double mid = low + (high - low) / 2.0;
            int count = 0;
            int p = 0, q = 1; // Fraction p/q is the best fraction found so far
            
            for (int i = 0, j = 1; i < n; i++) {
                while (j < n && arr[i] >= arr[j] * mid) j++;
                count += n - j;
                if (j < n && p * arr[j] < q * arr[i]) {
                    p = arr[i];
                    q = arr[j];
                }
            }
            
            if (count == k)
                return new int[]{p, q};
            else if (count < k)
                low = mid;
            else
                high = mid;
        }
        
        return new int[]{};
    }
}
