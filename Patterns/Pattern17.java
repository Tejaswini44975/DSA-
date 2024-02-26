/* Input: ‘N’ = 3

Output: 
    A
  A B A
A B C B A
 /*

public class Solution {
    public static void alphaHill(int n) {
        int space = n - 1;
        for (int i = 1; i <= n; i++) {
            
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }

            
            for (char ch = (char)('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }

            
            System.out.println();
            
            space--;
        }
    }
}
