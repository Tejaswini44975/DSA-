//https://practice.geeksforgeeks.org/problems/nearly-sorted-1587115620/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
class Solution
{
    //Function to return the sorted array.
    ArrayList <Integer> nearlySorted(int arr[], int num, int k)
    {
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i=0;i<arr.length;i++)
        {
            minHeap.add(arr[i]);
            if(minHeap.size()>k)
            {
                list.add(minHeap.peek());
                minHeap.poll();
            }
        }
       while(minHeap.size()>0)
       {
           list.add(minHeap.peek());
           minHeap.poll();
       }
        return list;
    }
}
