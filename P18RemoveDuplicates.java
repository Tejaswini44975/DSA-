class Solution {
	public List<Integer> removeDuplicates(List<Integer> nums) {
		Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (Integer num : nums) {
            if (set.add(num)) {
                result.add(num);
            }
        }

        return result;
    }
}

