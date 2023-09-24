class Solution {
    public int heightChecker(int[] heights) {
    int[] newheights = new int[heights.length];
    int count=0;
    for(int i=0;i<heights.length;i++)
    {
        newheights[i]=heights[i];
    }
    Arrays.sort(newheights);
    for(int i=0;i<heights.length;i++)
    {
        if(newheights[i]!=heights[i])
        {
            count++;
        }
    }
    return count;
    }
}