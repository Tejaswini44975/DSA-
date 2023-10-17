class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> result = new ArrayList<>();

        
        for (int num : nums) {
            
            String numStr = String.valueOf(num);

            
            for (char digitChar : numStr.toCharArray())
            {
                
                result.add(Character.getNumericValue(digitChar));
            }
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}