public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] slidingMaximum(final int[] A, int B) {
        List<Integer> result = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        
        for (int i = 0; i < A.length; i++) {
            // Remove elements from the front of the deque that are outside the current window
            while (!list.isEmpty() && list.peekFirst() < i - B + 1) {
                list.pollFirst();
            }
            
            // Remove elements from the back of the deque that are smaller than the current element
            while (!list.isEmpty() && A[list.peekLast()] < A[i]) {
                list.pollLast();
            }
            
            // Add the current element index to the deque
            list.offerLast(i);
            
            // Add the maximum element for the current window to the result
            if (i >= B - 1) {
                result.add(A[list.peekFirst()]);
            }
        }
        
        // Convert the result list to an array
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) 
        {
            resultArray[i] = result.get(i);
        }
        
        return resultArray;
    }
