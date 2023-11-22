class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1); // mp.put(nums[i] , remember this and see the word getOrDefault how to write properly)
        }
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((a,b)->a.getValue()-b.getValue()); //map.entry(remember to put .)

        for(Map.Entry<Integer, Integer> entry: mp.entrySet()) 
        {
              minHeap.add(entry);
                if(minHeap.size()>k)
                {
                     minHeap.poll();
                }
        }
        int[] result=new int[k];
        int i=0;
        while(!minHeap.isEmpty())
        {
            result[i++]=minHeap.poll().getKey();
        }
        return result;
    }
}
