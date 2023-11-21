class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        Queue<Integer> pq= new PriorityQueue<>();
        int[] a = new int[k];
        for(int i=0;i<n;i++)
        {
            pq.add(arr[i]);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        for(int i=k-1;i>=0;i--)
        {
            a[i]=pq.peek();
            pq.poll();
        }
        return a;
    }
}
