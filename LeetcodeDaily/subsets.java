class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            // Add the current subset to the result
            result.add(new ArrayList<>(current));
            return;
        }

        // Exclude the current element
        generateSubsets(nums, index + 1, current, result);

        // Include the current element
        current.add(nums[index]);
        generateSubsets(nums, index + 1, current, result);

        // Backtrack by removing the last element
        current.remove(current.size() - 1);
    }
        
    
}
