class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0)
        {
            return 0;
        }
        Arrays.sort(nums);
        int ans=0,count=0;
        ArrayList<Integer> result = new ArrayList<>();
        result.add(nums[0]);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                result.add(nums[i]);
            }
        }
        for(int i=0;i<result.size();i++)
        {
            if(i>0 && result.get(i)==result.get(i-1)+1)
            {
                count++;
            }
            else
            {
                count=1;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}