class Solution {
    public boolean checkValidString(String s) {
        int bal=0;
        for(char ch : s.toCharArray())
        {
            if(ch=='(' || ch=='*')
            {
                bal++;
            }
            else
            {
                bal--;
            }
            if(bal<0)
            {
                return false;
            }
        }
        if(bal==0)
        {
            return true;
        }
       bal=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(c==')' || c=='*')
            {
                bal++;
            }
            else
            {
                bal--;
            }
            if(bal<0)
            {
                return false;
            }
        }
        return true;
    }
}
