class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       // nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

       int i = m-1;
       int j = n-1;
       int k = m+n-1;

       while(j>=0)
       {
           if(i>=0 && nums1[i]>nums2[j])
           {
               nums1[k]=nums1[i];
               k--;
               i--;
           }
           else
           {
               nums1[k]=nums2[j];
                k--;
                j--; 
           }
       }

        
    }
}