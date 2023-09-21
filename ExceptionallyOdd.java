//gfg 
class Solution {
    int getOddOccurrence(int[] arr, int n) {
        HashMap<Integer,Integer> result = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(result.containsKey(arr[i]))
            {
                result.put(arr[i], result.get(arr[i])+1);
            }
            else
            {
                result.put(arr[i],1);
            }
        }
        for(var e: result.entrySet())
        {
            if(e.getValue()%2!=0)
            {
                return e.getKey();
            }
           
        }
        return -1;
    }
}

