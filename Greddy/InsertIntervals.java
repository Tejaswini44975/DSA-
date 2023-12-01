class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();

        for(int [] p:intervals)
        {
            if(p[1]<newInterval[0])
            {
                list.add(p);
            }
            else if(p[0]>newInterval[1])
            {
                list.add(newInterval);
                newInterval=p;
            }
            else
            {
               newInterval[0]=Math.min(p[0],newInterval[0]);
               newInterval[1]=Math.max(p[1],newInterval[1]); 
            }
        }
        list.add(newInterval);
        return list.toArray(new int[list.size()][2]);
    }
}
