class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                minHeap.add(arr[i][j]);
            }
        }
        while(!minHeap.isEmpty())
        {
            list.add(minHeap.poll());
        }
        return list;
    }
}
