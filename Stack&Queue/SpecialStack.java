class GfG{
    int minEle;
	public void push(int a,Stack<Integer> s)
	{
	   if(s.isEmpty())
	   {
	       minEle=a;
	       s.push(a);
	   }
	   else
	   {
	       if(a<minEle)
	       {
	           s.push(2*a-minEle);
	           minEle=a;
	       }
	       else
	       {
	           s.push(a);
	       }
	   }
	}
	
	public int pop(Stack<Integer> s)
        {
            if(s.isEmpty())
            {
                return -1;
            }
         else
         {
             int res;
             if(s.peek()<minEle)
             {
                res= minEle;
                minEle= 2*minEle-s.pop();
             }
            else
            {
                res= s.pop();
            }
            
            return res;
         }
	}
	public int min(Stack<Integer> s)
        {
            if(s.isEmpty())
            {
                return -1;
            }
           return minEle;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
            return s.size()==n;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           return s.isEmpty();
	}
}
