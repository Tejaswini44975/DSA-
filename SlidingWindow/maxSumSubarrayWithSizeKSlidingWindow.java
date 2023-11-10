class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
       
        long wSum=0;
        long mSum=Integer.MIN_VALUE;
        
        for(int i=0;i<K;i++)
        {
            wSum+=Arr.get(i);
        }
          mSum = Math.max(mSum, wSum);
        for(int i=K;i<N;i++)
        {
            wSum = wSum - Arr.get(i-K) + Arr.get(i);
            mSum=Math.max(mSum,wSum);
        }
        return mSum;
    }
}
