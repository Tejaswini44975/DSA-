import java.util.Stack;

public class Solution 
{
    public static void pushAtBottom(int data , Stack<Integer> s)
	{
		if(s.isEmpty())
		{
			s.push(data);
			return;
		}
		int top=s.pop();
		pushAtBottom(data, s);
		s.push(top);
	}
	public static void reverseStack(Stack<Integer> s)
  {
		if(s.isEmpty())
		{
			return;
		}
		int top=s.pop();
		reverseStack(s);
        pushAtBottom(top,s);
	}

}
