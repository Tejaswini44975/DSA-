//brute force

class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        ArrayList<Long> list = new ArrayList<>();
        for(int i=0;i<N-K+1;i++)
        {
            long sum=0;
            for(int j=i;j<i+K;j++)
            {
                sum+=Arr.get(j);
            }
            list.add(sum);
        }
        long max = Long.MIN_VALUE;
        for (long num : list) {
            max = Math.max(max, num);
        }

        return max;
    }
}
