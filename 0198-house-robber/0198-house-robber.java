class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int a[]=new int[n];
        if(n==0) return 0;
        else if(n==1) return nums[0];
        else if(n==2) return Math.max(nums[0],nums[1]);
        else
        {
            a[0]=nums[0];
            a[1]=Math.max(nums[1],nums[0]);
            for(int i=2;i<n;i++)
            {
                a[i]=Math.max(a[i-2]+nums[i],a[i-1]);
            }
        }
        return a[n-1];
    }
}