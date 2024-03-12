//https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/employee-rating-8cd8dc10/



    static int solve(int N, int[] workload){
        int count=0;
         int result = 0;
       for(int i=0;i<N;i++)
       {
        if(workload[i]>6)
        {
            count++;
            result=Math.max(result,count);
        }
        else
        {
            count=0;
        }
       }

        return result;
    
    }
}
