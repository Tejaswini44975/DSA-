class Solution {
	public int[] reverseArray(int[] arr) {
		int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        
        start++;
        end--;
        }
        return arr;
    }
}