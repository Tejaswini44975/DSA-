class Solution {
       public static int findMax(int[] piles)
       {
           int max=Integer.MIN_VALUE;
           for(int i=0;i<piles.length;i++)
           {
               if(piles[i]>max)
               {
                   max=Math.max(max,piles[i]);
               }
           }
           return max;
       } 
    public static int calculateTotalHours(int[] piles, int hourly)
    {
        int totalH=0;
        for(int i=0;i<piles.length;i++)
        {
            totalH+=Math.ceil((double)piles[i]/(double)(hourly));
        }
        return totalH;
    }
     public int minEatingSpeed(int[] piles, int h)
      {
              int low=1;
              int high=findMax(piles);
              while(low<=high)
              {
                  int mid=low+(high-low)/2;
                  int totalH=calculateTotalHours(piles,mid);
                  if(totalH<=h)
                  {
                      high=mid-1;
                  }
                  else
                  {
                  low=mid+1;
                  }
              }
              return low;
      }
}
