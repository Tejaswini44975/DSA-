//brute force

class Solution
{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N)
    {
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
    public static void main(String[] args) 
    {
        
        int K = 3;
        ArrayList<Integer> Arr = new ArrayList<>();
        Arr.add(1);
        Arr.add(4);
        Arr.add(2);
        Arr.add(10);
        Arr.add(2);
        Arr.add(3);
        int N = Arr.size();

       
        long result = Solution.maximumSumSubarray(K, Arr, N);

        System.out.println("Maximum sum subarray of size " + K + " is: " + result);
    }
}








}
