class Solution {
    public int singleNonDuplicate(int[] arr) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int ele:arr)
        if(mp.containsKey(ele))
        {
            mp.put(ele , mp.get(ele)+1);
        }
        else
        {
            mp.put(ele,1);
        }
        int minFreq=Integer.MAX_VALUE;
        int anskey=-1;
        for(var e:mp.entrySet())
        {
            if(e.getValue()<minFreq)
            {
                minFreq=e.getValue();
                anskey=e.getKey();
            }
        }
           return anskey;
    }
}

//leetcode 540question. It is done using HashMap(Single Element In a sorted array)
