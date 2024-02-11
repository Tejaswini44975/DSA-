/*

Input: ‘N’ = 3

Output: 

*****
 ***
  *

  */

public class Solution {
    public static void nStarTriangle(int n) {
        int noOfSpace=0;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=noOfSpace;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            noOfSpace=noOfSpace+1;
            System.out.println();
        }

    }
}
