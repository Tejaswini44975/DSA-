class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>()
        {
            public int compare(int[] a,int[] b)
            {
                return a[0]-b[0];
            }
        });
        int count=0;
        int left=0;
        int right=1;
         while(right<intervals.length)
         {
             if(intervals[left][1]<=intervals[right][0])
             {
                 left=right;
                 right+=1;
             }
             else if(intervals[left][1]<=intervals[right][1])
             {
                 count++;
                 right+=1;
             }
             else if(intervals[left][1]>intervals[right][1])   
            {
                count+=1;
                left = right;
                right+=1;
            }
         }
             return count;
    }
}
