//Brute-Force Approach

class Solution {
    public boolean isAnagram(String s, String t) {
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b))
        {
            return true;
        }
        return false;
    }
}

//Time Complexity: O(n * log(n))
//Space Complexity: O(n)

//Optimal Approach

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        s.replace(" ","");
        t.replace(" ","");

        int[] counts=new int[26];

        for(int i=0;i<s.length();i++)
        {
             counts[s.charAt(i)-'a']++;
        }

        for(int i=0;i<t.length();i++)
        {
            counts[t.charAt(i)-'a']--;
        }

        for(int count:counts)
        {
            if(count!=0)
            {
                return false;
            }
        }
        return true;
    }
}

////Time Complexity: O(n)
//Space Complexity: O(1)
