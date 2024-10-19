class Solution {
    public boolean checkRecord(String s) {
        int a=0,l=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='A')
            {
                a++;l=0;
            }
            else if(s.charAt(i)=='L')
            {
                l++;
            }
            else l=0;
            if(a>=2 || l>=3)
                return false;
        }
        System.out.println(l);
        return true;
    }
}