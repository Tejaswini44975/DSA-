class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        int i=0;
        int j=0;
        long sum=0;
        
       long mx=Integer.MIN_VALUE;
       while (j<N)
     {
         sum=sum+Arr.get(j); // do calculation to reduse tc
         if (j-i+1<K) 
         {
             j++;
         }// increament j upto when the size of the size of window is not equal to required size
         else if ((j-i+1)==K) // when sindow size hit to the required window size 
       {
          mx=Math.max(mx,sum); // selecting ans from the candidates
          sum=sum-Arr.get(i); // start removing from the first
          i++;
          j++;
        }
     }
            return mx;
    }
  public static void main(String[] args) {
        ArrayList<Integer> Arr = new ArrayList<>();
        // Add your array elements here

        int K = 3;
        int N = arr.size();

        System.out.println(maximumSumSubarray(K, Arr, N));
}
