class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> num=new ArrayList<>();
        for(int i=1;i<10;i++)
        {
            dfs(i,n,num);
        }
        return num;
    }
    public void dfs(int cur,int n,List<Integer> num)
    {
        if(cur>n)
            return;
        num.add(cur);
        for(int i=0;i<10;i++)
        {
            int next=cur*10+i;
            if(next>n)
                return;
            dfs(next,n,num);
        }
    }
}