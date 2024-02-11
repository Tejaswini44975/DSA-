/* Input: ‘N’ = 3

Output: 

  *
 ***
*****

*/

public class Solution {
    public static void nStarTriangle(int n) {
        int numberOfSpace=2;
       for(int i=1;i<=n;i+=2)
       {
           for(int j=1;j<=numberOfSpace;j++)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
             System.out.println();
           numberOfSpace=numberOfSpace-1;
       }
    }
}
