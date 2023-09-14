class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=0;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum=sum+nums[j];
                maxSum=Math.max(sum,maxSum);
            }
        }
        return maxSum;
        
    }
}