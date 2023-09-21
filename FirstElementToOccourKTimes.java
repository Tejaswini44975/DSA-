class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        HashMap<Integer,Integer> result = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(result.containsKey(a[i]))
            {
                result.put(a[i] ,result.get(a[i])+1);
            }
            else
            {
                result.put(a[i],1);
            }
            
        
        
            if(result.get(a[i])==k)
            {
                return a[i];
            }
            
        }
        return -1;
        
    } 
}