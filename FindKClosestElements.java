class Solution {
    public int[] findClosestElements(int[] arr, int k, int x) {
         List<Integer> result = new ArrayList<>();

        int left = 0, right = arr.length - k; 

    
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (Math.abs(arr[mid] - x) <= Math.abs(arr[mid + k] - x)) {
                right = mid;  
            } else {
                left = mid + 1;
            }
        }

        
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }

    
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
        }
}