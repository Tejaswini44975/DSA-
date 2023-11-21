class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair<Integer,Integer>> q=new PriorityQueue<>((a,b)-> b.getKey()!=a.getKey()?b.getKey()-a.getKey():b.getValue()-a.getValue());
        
        for(int i=0;i<arr.length;i++)
        {
            q.add(new Pair <>(Math.abs(x-arr[i]),arr[i]));
        }
        while(q.size()>k)
        {
            q.remove();
        }
        
        List<Integer> list=new ArrayList<>();
        
        while(!q.isEmpty())
        {
            list.add(q.remove().getValue());
        }
        
        Collections.sort(list);
        return list;
     
    }
}
