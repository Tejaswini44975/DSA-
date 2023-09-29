class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int maxCount=0;
        int rowIndex=-1;
        for(int row=0;row<arr.length;row++)
        {
            int count=0;
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col]==1)
                {
                    count++;
                }
            }
            if(count>maxCount)
            {
                maxCount=count;
                rowIndex=row;
            }
        }
        return rowIndex;
    }
}