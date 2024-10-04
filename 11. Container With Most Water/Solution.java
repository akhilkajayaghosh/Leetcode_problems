class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max_area=0;
        while(left<right)
        {
            int width=right-left;
            int cur=Math.min(height[left],height[right])*width;
            max_area=Math.max(cur,max_area);
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return max_area;
    }
}
