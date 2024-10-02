class Solution {
    public int partitionString(String s) {
        String s1=s.substring(0,1);
        //System.out.println(s1);
        StringBuilder sb=new StringBuilder();
        sb.append(s1);
        int count=0;
        for(int i=1;i<s.length();i++)
        {
            String val=String.valueOf(s.charAt(i));
            if((sb.indexOf(val))==-1)
            {
                sb.append(val);
            }
            else
            {
                count++;
                sb.setLength(0);
                sb.append(val);
            }
        }
        System.out.println(sb.toString());
        return count+1;
    }
}