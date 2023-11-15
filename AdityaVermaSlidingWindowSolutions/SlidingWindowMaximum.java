import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int[] slidingMaximum(final int[] A, int B) {
        List<Integer> result = new ArrayList<>();
        LinkedList<Integer> deque = new LinkedList<>();
        
        for (int i = 0; i < A.length; i++) {
            // Remove elements from the front of the deque that are outside the current window
            while (!deque.isEmpty() && deque.peekFirst() < i - B + 1) {
                deque.pollFirst();
            }
            
            // Remove elements from the back of the deque that are smaller than the current element
            while (!deque.isEmpty() && A[deque.peekLast()] < A[i]) {
                deque.pollLast();
            }
            
            // Add the current element index to the deque
            deque.offerLast(i);
            
            // Add the maximum element for the current window to the result
            if (i >= B - 1) {
                result.add(A[deque.peekFirst()]);
            }
        }
        
        // Convert the result list to an array
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        
        return resultArray;
    }
