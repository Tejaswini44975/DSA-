class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	Stack<Integer> st = new Stack<>();
    	for(int i=0;i<n;i++)
    	{
    	    st.push(i);
    	}
    	while(st.size()>=2)
    	{
    	    int i=st.pop();
    	    int j=st.pop();
    	    
    	    if(M[i][j]==1)
    	    {
    	        st.push(j);
    	    }
    	    else
    	    {
    	        st.push(i);
    	    }
    	}
    	int potential=st.pop();
    	for(int i=0;i<n;i++)
    	{
    	    if(i!=potential)  
    	    {
    	        if(M[i][potential]==0 || M[potential][i]==1)
    	        {
    	            return -1;
    	        }
    	    }
    	    
    	}
    	return potential;
    }
}
