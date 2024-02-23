class Solve {
    int[] findTwoElement(int arr[], int n) {
       
       
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

        
        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += arr[i];
            S2 += (long)arr[i] * (long)arr[i];
        }

      
        long val1 = S - SN;
        long val2 = S2 - S2N;

    
        val2 = val2 / val1;

    
        long x = (val1 + val2) / 2;
        long y = x - val1;

        int[] ans = {(int)x, (int)y};
        return ans;
    
    }
}
