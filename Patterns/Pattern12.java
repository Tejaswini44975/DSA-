/* Input: ‘N’ = 3

Output: 

1
0 1
1 0 1

/*

public class Solution {
    public static void nBinaryTriangle(int n) {
        int start=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                start=0;
            }
            else
            {
                start=1;
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }
}
