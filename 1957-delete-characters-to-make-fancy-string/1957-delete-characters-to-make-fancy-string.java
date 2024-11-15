class Solution {
    public String makeFancyString(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int count=1;
        sb.append(s.charAt(0));
        for(int i=1;i<n;i++)
        {
            if(s.charAt(i-1)==(s.charAt(i)))
                count++;
            else
                count=1;
            if(count>=3)
                continue;
            else
               sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}