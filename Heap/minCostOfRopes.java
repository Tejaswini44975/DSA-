//gfg problem
class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        
        for(int i=0;i<arr.length;i++)
        {
            minHeap.add(arr[i]);
        }
        long cost=0;
        while(minHeap.size()>=2)
        {
            long first=minHeap.peek();
            minHeap.poll();
            long second=minHeap.peek();
            minHeap.poll();
            cost=cost+first+second;
            minHeap.add(first+second);
        }
        return cost;
    }
}
