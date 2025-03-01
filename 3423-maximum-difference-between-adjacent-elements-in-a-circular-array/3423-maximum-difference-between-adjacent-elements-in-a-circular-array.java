class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            int d=Math.abs(nums[i]-nums[i+1]);
            if(d>=max)
                max=d;
        }
        int m=Math.abs(nums[n-1]-nums[0]);
        if(m>max)
            max=m;
        return max;
    }
}