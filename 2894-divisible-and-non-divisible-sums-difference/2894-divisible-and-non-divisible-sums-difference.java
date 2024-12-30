class Solution {
    public int differenceOfSums(int n, int m) {
        int num1=0;
        int sum=n*(n+1)/2;
        for(int i=1;i<=n;i++)
            if(i%m!=0)
                num1+=i; 
        return num1-(sum-num1);      
    }
}