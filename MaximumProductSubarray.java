class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0]; // Initialize maxProduct with the first element of nums.
        int minProduct = nums[0]; // Initialize minProduct with the first element of nums.
        int result = nums[0]; // Initialize the result with the first element of nums.

        for (int i = 1; i < nums.length; i++) {
            // If the current element is negative, swap maxProduct and minProduct
            if (nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Update maxProduct and minProduct for the current element
            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            // Update the overall result with the maximum product found so far
            result = Math.max(result, maxProduct);
        }

        return result;
    }
}
