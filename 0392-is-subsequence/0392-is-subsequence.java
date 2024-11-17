class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0,i=0,count=0;
        if(s.equals(t))
            return true;
        if(t.length()==0 || s.length()>t.length())
            return false;
        for(i=0;i<s.length();i++)
        {
            if(j==t.length() && i<s.length())
                return false;
            while(j<t.length())
            {
                if(s.charAt(i)==t.charAt(j))
                {
                    j++;
                    count++;
                    break;
                }
                else
                    j++;
            }
        }
        if(count==s.length())
            return true;
        else
            return false;
    }
}