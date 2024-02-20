// Approach 1

class Solution {
    public void sortColors(int[] nums) {
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                count1++;
            }
            else if(nums[i]==1)
            {
                count2++;
            }
            else if(nums[i]==2)
            {
                count3++;
            }
        }
     int z=0;
     for(int i=0;i<count1;i++)
     {
         nums[z++]=0;
     }
     for(int i=0;i<count2;i++)
     {
         nums[z++]=1;
     }
     for(int i=0;i<count3;i++)
     {
         nums[z++]=2;
     }
        
    }
}


//Approach 2

class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high)
        {
            switch(nums[mid])
            {
                 case 0:
               {
                  int temp=nums[low];
                  nums[low]=nums[mid];
                  nums[mid]=temp;
                  low++;
                  mid++;
                  break;
               }
                 case 1:
                 {
                     mid++;
                     break;
                 }
                 case 2:
                 {
                     int temp=nums[mid];
                     nums[mid]=nums[high];
                     nums[high]=temp;
                     high--;
                     break;
                 }
            }
        }
    }
}
