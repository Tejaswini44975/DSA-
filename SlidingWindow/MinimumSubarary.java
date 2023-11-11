//bruteforce
class Solution{
    static long minimumSumSubarray(int K, ArrayList<Integer> Arr,int N){
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
        long min = Long.MAX_VALUE;
        for (long num : list) {
            min = Math.min(max, num);
        }

        return min;
    }
}
