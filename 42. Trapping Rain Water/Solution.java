class Solution {
    public int trap(int[] height) {
        int left[]=new int[height.length];
        int right[]=new int[height.length];
        int n=height.length;
        int l=0;
        int water=0;
        for(int i=0;i<n;i++)
        {
            if(height[i]>l)
                l=height[i];
            left[i]=l;
        }
        int r=0;
        for(int i=n-1;i>=0;i--)
        {
            if(height[i]>r)
                r=height[i];
            right[i]=r;
        }
        for(int i=0;i<n;i++)
        {
            water=water+Math.min(left[i],right[i])-height[i];
        }
        return water;
    }
}
