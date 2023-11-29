class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives=0;
        int tens=0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                 fives++;
            }
            else if(bills[i]==10)
            {
                tens++;
                fives--;
            }
            else if(tens>0)
            {
                   tens--;
                   fives--;
            }
            else
            {
                fives -= 3;
            }
            
            if(fives<0)
            {
                return false;
            }
        }
        return true;
    }
}
