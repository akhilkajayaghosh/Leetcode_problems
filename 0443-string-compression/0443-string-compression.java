class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<n)
        {
            char ch=chars[i];
            int count=0;
            while(i<n && ch==chars[i])
            {
                count++;
                i++;
            }
            sb.append(ch);
            if (count > 1) {
                sb.append(count);
            }
        }
        String val=sb.toString();
        for(int j=0;j<val.length();j++)
            chars[j]=val.charAt(j);
        return val.length();
    }
}