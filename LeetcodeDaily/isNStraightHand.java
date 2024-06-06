
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i=0;i<hand.length;i++)
        {
            minHeap.add(hand[i]);
        }
       while(!minHeap.isEmpty())
       {
           int smallest=minHeap.poll();
           for(int i=1;i<groupSize;i++)
           {
               if(minHeap.remove(smallest+i))
               continue;
               else
               return false;
           }
       }
       return true;
    }
}
