class Solution {
    public int findDuplicate(int[] nums) {
       HashMap<Integer,Integer> result = new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
           if(result.containsKey(nums[i]))
           {
               result.put(nums[i],result.get(nums[i])+1);
           }
           else
           {
               result.put(nums[i],1);
           }
       } 
       int anskey=-1;
       for(var e : result.entrySet())
       {
           if(e.getValue()>1)
           {
               anskey=e.getKey();
               break;
           }
       }
       return anskey;
    }
}
