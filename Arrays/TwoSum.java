//BruteForce Approach

class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(target==nums[i] + nums[j])
                {
                    return new int[] {i,j} ;
                }
            }
        }
        return null;
        
    }
}

//Optimal Approach

class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                return new int[] {mpp.get(moreNeeded), i};
            }

            mpp.put(num, i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

