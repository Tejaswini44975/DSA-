//gfg easy problems(sorted myself)

class Solution
{
    long findMaxSubarraySum(long arr[], int N,int X)
    {
        int i=0;
        int j=0;
        
        long sum = 0;
        long maxSum=0;
        while(j<N)
        {
            sum+=arr[j];
            
            while (sum > X) {
                sum -= arr[i];
                i++;
            }

            maxSum = Math.max(maxSum, sum);
            j++;
        }

        return maxSum;
    }
}
