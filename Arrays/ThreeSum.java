//Bruteforce

class Solution 
{
    public List<List<Integer>> threeSum(int[] arr)
  {
        int n=arr.length;
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;i<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==0)
                    {
                        List<Integer> temp=Arrays.asList(arr[i]+arr[j]+arr[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>(st);
        return ans;
    }
}
