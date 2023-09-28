//gfg brute force approach
class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<=n-k;i++)
        {
            int max=arr[i];
            for(int j=i;j<i+k;j++)
            {
                if(arr[j]>max)
                {
                    max=arr[j];
                }
            }
                result.add(max);
        }
        return result;
    }
}