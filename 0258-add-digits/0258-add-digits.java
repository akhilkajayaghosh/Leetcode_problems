class Solution {
    public int addDigits(int num) {
        //if(digit(num)==1) return num;
        while(num>=10)
            num=sum(num);
        return num;
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