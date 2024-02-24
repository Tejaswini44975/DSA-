/* Input: ‘N’ = 3

Output: 
A
B B
C C C  */





public class Solution {
    public static void alphaRamp(int n) {
        for(int i=1;i<=n;i++)
        {
            char ch=(char)('A'+i-1);
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
