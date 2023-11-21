class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
         PriorityQueue<Integer> pq=new PriorityQueue<>();
         for (int i:arr) {
            if(k>0)
            {
                pq.offer(i);
                k--;
            } 
            else if(Math.abs(pq.peek() - x)>Math.abs(i- x)) 
            {
                pq.poll();
                pq.offer(i);
            }
        }
        List<Integer>list=new ArrayList<>();
        while(pq.size()>0)
        {
            list.add(pq.poll());
        }
        return list;
    }
}
