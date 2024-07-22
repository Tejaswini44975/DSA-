class Solution 
{
    public int print2largest(List<Integer> arr) 
    {
        if(arr == null || arr.size()<2)
        {
            return -1;
        }
        
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        
        for(int num:arr)
        {
            if(num>first)
            {
                second=first;
                first=num;
            }
            else if(num>second && num!=first)
            {
                second=num;
            }
        }
        if (second == Integer.MIN_VALUE)
        {
            return -1;
        }

        return second;
    }
}
