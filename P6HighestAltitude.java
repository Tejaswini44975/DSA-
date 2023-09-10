class Solution {
    public int largestAltitude(int[] gain) {
        int max=Integer.MIN_VALUE;
        int alt=0;
        for(int i=0;i<gain.length;i++)
        {
            alt=alt+gain[i];
            max=Math.max(max,alt);
        }
        if(max<0)
        {
            return 0;
        }
        return max;
    }
}