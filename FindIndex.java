class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int a[], int N, int key) 
    { 
        int[] result={-1,-1};
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                result[0]=i;
                break;
            }
        }
       for (int i = N - 1; i >= 0; i--) {
            if (a[i] == key) {
                result[1] = i;
                break; 
            }
        }
        return result;
    }
}