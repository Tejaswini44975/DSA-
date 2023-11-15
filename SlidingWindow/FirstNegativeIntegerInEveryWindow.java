//gfg problem

class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
       int i = 0;
        int j = 0;
        long[] ans = new long[N - K + 1];
        int index = 0;
        LinkedList<Long> l = new LinkedList<>();
        while (j < N) {
            if (A[j] < 0){
                l.add(A[j]);
            }
            if (j - i + 1 < K){
                j++;
            }   
            else if (j - i + 1 == K) {
                if (l.size() == 0){
                    ans[index++] = 0;
                }
                else{
                    ans[index++] = l.getFirst();
                }
                if (A[i] < 0){
                    l.removeFirst();
                }
                i++;
                j++;
            }
        }

        return ans;
    }
}
