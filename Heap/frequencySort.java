class Solution {
    public int[] frequencySort(int[] nums)
     {
    Map<Integer,Integer> mp = new HashMap<>();
      for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
       PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>( (a, b) -> a.getValue() == b.getValue() ? Integer.compare(b.getKey(), a.getKey()): a.getValue() - b.getValue());

    
       for(Map.Entry<Integer, Integer> entry: mp.entrySet())
       {
       minHeap.add(entry);
       }

       int[] result=new int[nums.length];
       int index=0;
       while(!minHeap.isEmpty())
       {
           int freq=minHeap.peek().getValue();
           int ele=minHeap.peek().getKey();

           for(int i=0;i<freq;i++)
           {
               result[index++]=ele;
           }
           minHeap.poll();
       }
       return result;
    }
}
