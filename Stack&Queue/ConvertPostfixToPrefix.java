import java.util.Stack;
public class Solution
  {
    public static String postfixToPrefix(String exp) 
    {
        Stack<String> st = new Stack<>();
        for(int i=0;i<exp.length();i++)
        {
            char ch = exp.charAt(i);
            String strCh = String.valueOf(ch);

            if(Character.isLetter(strCh.charAt(0)))
            {
                st.push(strCh);
            }
            else
            {
                String v2 = st.pop();
                String v1 = st.pop();
                String op = strCh;
                String t = op + v1 + v2;
                st.push(t);
            }
        }
        return st.peek();
    }
}
