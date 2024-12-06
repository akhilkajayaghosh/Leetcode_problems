class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> mp=new TreeMap<>();
        int n=names.length;
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        {
            mp.put(heights[i],names[i]);
        }
        int c=n-1;
        for(Map.Entry<Integer,String> e:mp.entrySet())
        {
            str[c--]=e.getValue();
        }
        return str;
    }
}