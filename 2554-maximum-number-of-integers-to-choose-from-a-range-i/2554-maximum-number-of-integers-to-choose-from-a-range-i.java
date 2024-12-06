class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> arr=new HashSet<>();
        int m=banned.length;
        for(int i=0;i<m;i++)
        {
            if(banned[i]<=n)
                arr.add(banned[i]);
        }
        int sum=0,count=0;
        for(int i=1;i<=n;i++)
        {
            if(!arr.contains(i))
            {
                sum+=i;
                if(sum>maxSum)
                    break;
                count++;
            }
        }
        return count;
    }
}