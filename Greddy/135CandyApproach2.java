class Solution 
{
    public int candy(int[] ratings)
   {
      int N = ratings.length;
         int[] leftCandy = new int[N];
        int[] rightCandy=new int[N];
        Arrays.fill(leftCandy,1);
        Arrays.fill(rightCandy,1);
        for(int i=1;i<N;i++)
        {
            if(ratings[i]>ratings[i-1])
            {
                leftCandy[i]=leftCandy[i-1]+1;
            }
        }
        for(int i=N-2;i>=0;i--)
        {
            if(ratings[i]>ratings[i+1])
            {
                rightCandy[i]=rightCandy[i+1]+1;
            }
        }
        int res=0;
        for(int i=0;i<N;i++)
        {
            res+=Math.max(leftCandy[i],rightCandy[i]);
        }
        return res;
    }
}
