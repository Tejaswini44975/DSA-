class Solution {
	public int secondSmallest(int[] nums) {
		int min=Integer.MAX_VALUE;
        int sec_min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                sec_min=min;
                min=nums[i];
            }
            else if(nums[i]<sec_min && nums[i]!=min)
            {
                sec_min=nums[i];
            }
            else if(sec_min==Integer.MAX_VALUE)
            {
                return -1;
            }
        }
        return sec_min;
	}
}