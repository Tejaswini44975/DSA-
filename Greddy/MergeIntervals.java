class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
      return intervals;

    // Sort by ascending starting point
    Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
    });

    List<int[]> list = new ArrayList<>();

    int[] newInterval = intervals[0];
    list.add(newInterval);

    for (int[] interval : intervals) {
      if (interval[0] <= newInterval[1])
    {
        // Overlapping intervals,
        // update the end if needed
        newInterval[1] = Math.max(newInterval[1], interval[1]);
    }
      else
       {
        // Disjoint intervals,
        // add the new interval to the list
        newInterval = interval;
        list.add(newInterval);
      }
    }

    return list.toArray(new int[list.size()][2]);
        
    }
 }
