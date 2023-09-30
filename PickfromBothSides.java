public class Solution {
    public int solve(int[] A, int B) {
        int n=A.length;
        int currSum=0;
        for(int i=0;i<B;i++)
        {
            currSum+=A[i];
        }
        int maxSum=currSum;
        int inc=n-1;
        int exc=B-1;
        while(inc>=0 && exc>=0)
        {
            currSum+=A[inc--];
            currSum-=A[exc--];
            maxSum=Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}
