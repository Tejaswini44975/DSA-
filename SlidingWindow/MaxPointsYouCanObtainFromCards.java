class Solution
  {
    public int maxScore(int[] cardPoints, int k)
    {
        int total = 0;
        for (int i = 0; i < k; i++) 
          {
          total += cardPoints[i];
          }
        int best = total;
        for (int i = k - 1, j = cardPoints.length - 1; i >= 0; i--, j--) 
        {
            total += cardPoints[j] - cardPoints[i];
            best = Math.max(best, total);
        }
        return best;
    }
    public static void main(String[] args) 
    {
        Solution s = new Solution();

        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;

        int result = s.maxScore(cardPoints, k);

        System.out.println(result);
    }
}
