class Solution { 
    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2)
    {
         PriorityQueue<Long> minHeap = new PriorityQueue<>();
    for (int i = 0; i < N; i++) 
    {
      minHeap.add(A[i]);
    }
           long ans = 0;
            int i = 1;
            int j = 1;
        while (j < K2)
          {
               if (i > K1) 
               {
                  ans += minHeap.peek();
               }
             minHeap.poll();
             i++;
             j++;
          }
        return ans;
    }
    
}
