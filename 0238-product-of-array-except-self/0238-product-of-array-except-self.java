class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int pr[]=new int[n];
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=nums[0];
        right[n-1]=nums[n-1];
        for(int i=1;i<n;i++)
        {
            left[i]=nums[i]*left[i-1];
        }
        for(int i=n-2;i>=0;i--)
        {
            right[i]=nums[i]*right[i+1];
        }
        pr[0]=right[1];
        pr[n-1]=left[n-2];
        for(int i=1;i<n-1;i++)
            pr[i]=left[i-1]*right[i+1];        
        return pr;
    }
}