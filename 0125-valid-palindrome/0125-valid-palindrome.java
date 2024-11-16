class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            int ch=(int)s.charAt(i);
            if(ch<=47 ||(ch>=58 && ch<=64)||(ch>=91 && ch<=96)||ch>=123)
                continue;
            else
                sb.append(s.charAt(i));
        }
        String str=sb.toString().toLowerCase();
        int m=str.length();
        for(int i=0;i<m/2;i++)
            if(str.charAt(i)!=str.charAt(m-i-1))
                return false;
        return true;
    }
}