class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int count=0;
        int exp[]=new int[heights.length];
        for(int i=0;i<n;i++)
        {
            exp[i]=heights[i];
        }
        Arrays.sort(exp);
        for(int i=0;i<n;i++)
        {
            if(heights[i]!=exp[i])
                count++;
        }
        return count;
    }
}