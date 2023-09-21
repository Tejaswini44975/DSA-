
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int left=0;
       int right=n-1;
       int mid=0;
     
       while(left<=right)
       {
            mid=left+(right-left)/2;
           if((mid==0 || nums[mid-1]<nums[mid]) && (mid==n-1 || nums[mid]>nums[mid+1]))
           {
               return mid;
           }
           else if(mid>0 && nums[mid-1]>nums[mid])
           {
               right=mid-1;
           }
           else
           {
               left=mid+1;
           }
       }
       return -1;
       
    }
} 
