class GetMin
{
    //Function to push all the elements into the stack.
    public static Stack<Integer> _push(int arr[],int n)
    {
        Stack<Integer> s =new Stack<>();
        int min=arr[0];
        s.push(min);
        
        for(int i=1;i<n;i++)
        {
            min=Math.min(min,arr[i]);
            s.push(min);
        }
        return s;
        
    }
    
    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer>s)
    {
        while(!s.empty())
            System.out.print(s.pop()+" ");
    }
}
