/*
Input: ‘N’ = 3

Output: 

A B C
A B
A /*

public class Solution {
    public static void nLetterTriangle(int n) {
        for(int i=n;i>=1;i--)
        {
            for(char ch='A';ch<'A'+i;ch++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
