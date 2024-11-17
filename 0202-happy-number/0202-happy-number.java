class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> st=new HashSet<>();
        while(n!=1 && !st.contains(n))
        {
            st.add(n);
            n=sum(n);
        }
        if(n==1)
            return true;
        else
            return false;
    }
    public int sum(int num)
    {
        int sum=0;
        while(num>0)
        {
            int dig=(num%10);
            sum+=(dig*dig);
            num/=10;
        }
        return sum;
    }
}