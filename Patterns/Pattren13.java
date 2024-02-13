/*Input: ‘N’ = 3

Output: 

1         1
1 2     2 1
1 2 3 3 2 1
/*

public class Solution {
    public static void numberCrown(int n) {
        for (int i = 1; i <= n; i++) {
            // Print numbers in ascending order
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print spaces
            int numSpaces = 2 * (n - i);
            for (int j = 1; j <= numSpaces; j++) {
                System.out.print(" ");
            }

            // Print numbers in descending order
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }  
}
