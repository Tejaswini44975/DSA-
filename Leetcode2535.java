class Solution {
    public int differenceOfSum(int[] nums) {
    int elementSum = 0;
        int digitSum = 0;
        
        // Calculate element sum
        for (int num : nums) {
            elementSum += num;
        }
        
        // Calculate digit sum
        for (int num : nums) {
            int temp = num;
            while (temp > 0) {
                digitSum += temp % 10; // Get the last digit of the number
                temp /= 10; // Remove the last digit
            }
        }
        
        // Calculate the absolute difference
        return Math.abs(elementSum - digitSum);
    
    }
}