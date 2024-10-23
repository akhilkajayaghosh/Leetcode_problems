class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) 
            return new int[]{-1,-1};
        int res[]=new int[2];
        res[0]=find_min(nums,target);
        res[1]=find_max(nums,target);
        return res;
    }
    public int find_min(int nums[],int target)
    {
        int low=0;
        int high=nums.length-1;
        int min_val=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
            {
                min_val=mid;
                high=mid-1;
            }
            else if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return min_val;
    }
    public int find_max(int nums[],int target)
    {
        int low=0;
        int high=nums.length-1;
        int max_val=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
            {
                max_val=mid;
                low=mid+1;
            }
            else if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return max_val;
    }
}