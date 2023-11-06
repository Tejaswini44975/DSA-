import java.util.Stack;

public class Solution
  {
    public static String preToPost(String s)
    {
        Stack<String> st = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--)
          {
            char ch = s.charAt(i);
            String strCh = String.valueOf(ch);  // Convert char to String

            if (Character.isLetter(strCh.charAt(0)))
            {
                st.push(strCh);
            } 
            else
            {
                String val1 = st.pop();
                String val2 = st.pop();
                String op = strCh;  // Store the operator as a String
                String t = val1 + val2 + op;
                st.push(t);
            }
        }
        return st.peek();
    }
}
