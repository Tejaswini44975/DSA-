/*Input: ‘N’ = 3

Output: 
1
1 2 
1 2 3 */

public class Solution
  {
    public static void nTriangle(int n) 
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}


