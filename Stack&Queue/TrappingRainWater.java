class Solution {
    public int trap(int[] height) {
        int result=0;
     for(int i=1;i<=height.length-2;i++)
     {
         int lb=height[i];
         for(int j=0;j<i;j++)
         {
            if(height[j]>lb)
           {
             lb=height[j];
           }
         }
         int rb=height[i];
        for(int j=i+1;j<height.length;j++)
         {
            if(height[j]>rb)
           {
             rb=height[j];
           }
         } 
         int wl = Math.min(lb, rb);
         int tw=wl-height[i];
         result+=tw;
     }
    return result;
    }
}
