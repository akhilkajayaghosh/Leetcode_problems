class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int m=str1.length();
        int n=str2.length();
        if(m<n) return false;
        int i=0,j=0;
        while(i<n && j<m)
        {
            char c1=str2.charAt(i);
            char c2=str1.charAt(j);
            if(c1==c2 || c1==(c2+1)||(c2=='z' && c1=='a'))
            {
                i++;
            }
            j++;
        }
        if(i>n-1) return true;
        else return false;
    }
}