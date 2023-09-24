class Solution {
	public int majorityElement(int[] nums) {
	    int max=0;
	    int n=nums.length;
		for(int i=0;i<nums.length;i++)
		{
		    int count=0;
		 for(int j=0;j<nums.length;j++)
		 {
		     if(nums[i]==nums[j])
		     {
		     count++;
		     }
		    if(count>max)
		    {
		        max=count;
		        
		    }
		}
		if(max>n/2)
		{
		    return nums[i];
		}
		}
		return -1;
	}
}