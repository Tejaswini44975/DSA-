class Solution {
    public boolean search(int[] nums, int target) {
         int low=0;
       int high=nums.length-1;
       while(low<=high)
       {
           int mid=low+(high-low)/2;
           if(target==nums[mid])
           {
               return true;
           }
           if(nums[low]==nums[mid] && nums[mid]==nums[high])
           {
                low=low+1;
                high=high-1;
                continue;
           }

           if(nums[low]<=nums[mid])
           {
               if(target>=nums[low] && target<nums[mid])
               {
                   high=mid-1;
               }
               else
               {
                   low=mid+1;
               }
           }
           else
           {
               if(target<=nums[high] && target>nums[mid])
               {
                   low=mid+1;
               }
               else
               {
                   high=mid-1;
               }
           }
       } 
       return false;
    
    }
}
