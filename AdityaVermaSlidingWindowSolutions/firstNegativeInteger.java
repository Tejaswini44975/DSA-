class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        long i = 0;
        long j = 0;
        List<Long> List = new ArrayList<>();
        LinkedList<Long> l = new LinkedList<>();

        while (j < N) {
            if (A[(int) j] < 0)
                l.add(A[(int) j]);

            if (j - i + 1 < K)
                j++;
            else if (j - i + 1 == K) {
                if (l.size() == 0)
                    List.add(0L);
                else
                    List.add(l.getFirst());

                if (A[(int) i] < 0)
                    l.removeFirst();

                i++;
                j++;
            }
        }

        // Convert List<Long> to long[]
        long[] ansArray = new long[List.size()];
        for (int index = 0; index < List.size(); index++) {
            ansArray[index] = List.get(index);
        }

        return ansArray;
    
    }
}
