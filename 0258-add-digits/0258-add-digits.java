class Solution {
    public int addDigits(int num) {
        if(digit(num)==1) return num;
        while(digit(num)>1)
        {
            int val=sum(num);
            num=val;
        }
        return num;
    }
    public int digit(int n)
    {
        int count=0;
        while(n!=0)
        {
            n/=10;
            ++count;
        }
        return count;
    }
    public int sum(int n)
    {
        int s=0;
        while(n>0)
        {
            s+=(n%10);
            n/=10;
        }
        return s;
    }
}