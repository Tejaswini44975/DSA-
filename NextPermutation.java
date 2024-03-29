class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length; 

        // Step 1: Find the break point:
        int ind = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                
                ind = i;
                break;
            }
        }

        
        if (ind == -1) {
            
            reverse(nums, 0, n - 1);
            return;
        }


        for (int i = n - 1; i > ind; i--) {
            if (nums[i] > nums[ind]) {
                int tmp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = tmp;
                break;
            }
        }

        reverse(nums, ind + 1, n - 1);
    
    }
     private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
     }
}
